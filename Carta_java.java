{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyOD88kRXhYJEJoml05Uf39s",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/ChellySil/Cadastro/blob/main/Carta_java.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "flp61tV1CSbi"
      },
      "outputs": [],
      "source": [
        "public class Carta {\n",
        "    private String valor;\n",
        "    private String naipe;\n",
        "\n",
        "\n",
        "    public Carta(String valor, String naipe) {\n",
        "        this.valor = valor;\n",
        "        this.naipe = naipe\n",
        "    }\n",
        "\n",
        "    public String getValor() {\n",
        "        return valor;\n",
        "    }\n",
        "\n",
        "    public String getNaipe() {\n",
        "        return naipe;\n",
        "    }\n",
        "\n",
        "    public String toString() { \n",
        "        return valor + \" de \" + naipe;\n",
        "    }\n",
        "\n",
        "}"
      ]
    }
  ]
}