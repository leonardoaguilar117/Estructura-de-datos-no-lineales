import networkx as nx
import matplotlib.pyplot as plt

INF = float('inf')


def floyd_warshall(graph):
    G = nx.Graph()
    G.add_nodes_from(range(len(graph)))

    for i in range(len(graph)):
        for j in range(len(graph)):
            if i != j and graph[i][j] != 0:
                G.add_edge(i, j, weight=graph[i][j])

    pos = nx.spring_layout(G)  # Layout para posicionar los nodos

    labels = nx.get_edge_attributes(G, 'weight')

    plt.figure()
    plt.title("Grafo Inicial")
    nx.draw(G, pos, with_labels=True, node_size=700,
            node_color='skyblue', font_size=10, font_weight='bold')
    nx.draw_networkx_edge_labels(G, pos, edge_labels=labels)
    plt.show()

    dist = [[INF for _ in range(len(graph))] for _ in range(len(graph))]
    for i in range(len(graph)):
        for j in range(len(graph)):
            if i == j:
                dist[i][j] = 0
            elif graph[i][j] != 0:
                dist[i][j] = graph[i][j]

    for k in range(len(graph)):
        for i in range(len(graph)):
            for j in range(len(graph)):
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
                plt.figure()
                plt.title(
                    f"Matriz de Distancias Después de la Iteración {k+1}")
                nx.draw(G, pos, with_labels=True, node_size=700,
                        node_color='skyblue', font_size=10, font_weight='bold')
                nx.draw_networkx_edge_labels(G, pos, edge_labels=labels)
                for u, v, d in G.edges(data=True):
                    # Ajuste de la posición del texto del peso de la arista
                    plt.text((pos[u][0] + pos[v][0]) / 2, (pos[u][1] + pos[v][1]) / 2, d['weight'],
                             horizontalalignment='center', verticalalignment='center', bbox=dict(facecolor='white', alpha=0.5))
                plt.text(pos[i][0], pos[i][1] - 0.1,
                         f"Distancia a {j}: {dist[i][j]}", horizontalalignment='center')
                plt.show()

    return dist


# Ejemplo de uso
grafo = [
    [0, 3, 0, 7],
    [8, 0, 2, 0],
    [5, 0, 0, 1],
    [2, 0, 0, 0]
]

resultado = floyd_warshall(grafo)
for fila in resultado:
    print(fila)
