import tkinter as tk

class App(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.pack()

myapp = App()
myapp.master.title("anarchy-artichokey's Grade Calculator PE")
myapp.master.maxsize(1000,400)

myapp.mainloop()