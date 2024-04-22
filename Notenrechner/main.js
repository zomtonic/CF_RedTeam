        document.getElementById("s801").innerHTML = (~~(Skalen[1][Ergebnisse[1] - 2] + 1) + " - " + clamp(Skalen[1][Ergebnisse[1] - 1], 0, 80));
        document.getElementById("s901").innerHTML = (~~(Skalen[2][Ergebnisse[1] - 2] + 1) + " - " + clamp(Skalen[2][Ergebnisse[1] - 1], 0, 90));
        document.getElementById("s1001").innerHTML = (~~(Skalen[3][Ergebnisse[1] - 2] + 1) + " - " + clamp(Skalen[3][Ergebnisse[1] - 1], 0, 100));
        document.getElementById("s1201").innerHTML = (~~(Skalen[4][Ergebnisse[1] - 2] + 1) + " - " + clamp(Skalen[4][Ergebnisse[1] - 1], 0, 120));

        document.getElementById("s802").innerHTML = (~~(Skalen[1][Ergebnisse[1] - 1] + 1) + " - " + clamp(Skalen[1][Ergebnisse[1]], 0, 80));
        document.getElementById("s902").innerHTML = (~~(Skalen[2][Ergebnisse[1] - 1] + 1) + " - " + clamp(Skalen[2][Ergebnisse[1]], 0, 90));
        document.getElementById("s1002").innerHTML = (~~(Skalen[3][Ergebnisse[1] - 1] + 1) + " - " + clamp(Skalen[3][Ergebnisse[1]], 0, 100));
        document.getElementById("s1202").innerHTML = (~~(Skalen[4][Ergebnisse[1] - 1] + 1) + " - " + clamp(Skalen[4][Ergebnisse[1]], 0, 120));

        document.getElementById("s803").innerHTML = (~~(Skalen[1][Ergebnisse[1]] + 1) + " - " + clamp(Skalen[1][Ergebnisse[1] + 1], 0, 80));
        document.getElementById("s903").innerHTML = (~~(Skalen[2][Ergebnisse[1]] + 1) + " - " + clamp(Skalen[2][Ergebnisse[1] + 1], 0, 90));
        document.getElementById("s1003").innerHTML = (~~(Skalen[3][Ergebnisse[1]] + 1) + " - " + clamp(Skalen[3][Ergebnisse[1] + 1], 0, 100));
        document.getElementById("s1203").innerHTML = (~~(Skalen[4][Ergebnisse[1]] + 1) + " - " + clamp(Skalen[4][Ergebnisse[1] + 1], 0, 120));


        document.getElementById("np801").innerHTML = (Ergebnisse[1] - 1);
        document.getElementById("np901").innerHTML = (Ergebnisse[2] - 1);
        document.getElementById("np1001").innerHTML = (Ergebnisse[3] - 1);
        document.getElementById("np1201").innerHTML = (Ergebnisse[4] - 1);

        document.getElementById("np802").innerHTML = (Ergebnisse[1]);
        document.getElementById("np902").innerHTML = (Ergebnisse[2]);
        document.getElementById("np1002").innerHTML = (Ergebnisse[3]);
        document.getElementById("np1202").innerHTML = (Ergebnisse[4]);

        document.getElementById("np803").innerHTML = (Ergebnisse[1] + 1);
        document.getElementById("np903").innerHTML = (Ergebnisse[2] + 1);
        document.getElementById("np1003").innerHTML = (Ergebnisse[3] + 1);
        document.getElementById("np1203").innerHTML = (Ergebnisse[4] + 1);
