import tkinter as tk
from tkinter import ttk

class TelaCriacaoHeroi(tk.Tk):

    def __init__(self):
        super().__init__()

        self.title("IF Quest")
        self.geometry("400x250")
        self.protocol("WM_DELETE_WINDOW", self.destroy)

        self.titulo = tk.Label(
            self,
            text="Criação de Herói",
            anchor="center"

        )

        painelFormulario = tk.Frame(self)

        rotuloNome = tk.Label(painelFormulario, text="Nome:")
        rotuloVida = tk.Label(painelFormulario, text="Vida inicial:")
        rotuloClasse = tk.Label(painelFormulario, text="Classe:")

        self.campoNome = tk.Entry(painelFormulario)
        self.campoVida = tk.Entry(painelFormulario)
        self.campoClasse = tk.Entry(painelFormulario)

        painelFormulario.grid_columnconfigure(0, weight=1)
        painelFormulario.grid_columnconfigure(1, weight=1)

        rotuloNome.grid(row=0, column=0, padx=5, pady=5)
        self.campoNome.grid(row=0, column=1, padx=5, pady=5)

        rotuloVida.grid(row=1, column=0, padx=5, pady=5)
        self.campoVida.grid(row=1, column=1, padx=5, pady=5)

        rotuloClasse.grid(row=2, column=0, padx=5, pady=5)
        self.campoClasse.grid(row=2, column=1, padx=5, pady=5)

        self.botaoCriar = tk.Button(
            self,
            text="Criar Herói",
            state="disabled"
        )

        self.titulo.pack(side="top", fill="x", pady=5)

        painelFormulario.pack(
            side="top",
            fill="both",
            expand=True,
            padx=20,
            pady=10
        )

        self.botaoCriar.pack(side="bottom", pady=5)

        self.titulo.config(text="Criação de Herói - IF Quest")

        print("Nome inicial:", self.campoNome.get())
        print("Vida inicial:", self.campoVida.get())
        print("Classe inicial:", self.campoClasse.get())


if __name__ == "__main__":
    tela = TelaCriacaoHeroi()
    tela.mainloop()