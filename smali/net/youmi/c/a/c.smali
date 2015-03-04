.class public Lnet/youmi/android/c/a/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;

.field private static j:Ljava/lang/String;

.field private static k:Ljava/lang/String;

.field private static l:Ljava/lang/String;

.field private static m:Ljava/lang/String;

.field private static n:Ljava/lang/String;

.field private static o:Ljava/lang/String;

.field private static p:Ljava/lang/String;

.field private static q:Ljava/lang/String;


# direct methods
.method public static a()Landroid/graphics/Bitmap;
    .locals 1

    const-string v0, "iVBORw0KGgoAAAANSUhEUgAAACgAAAAoCAMAAAC7IEhfAAAAA3NCSVQICAjb4U/gAAABDlBMVEX////m5ua1tbUhISEAAADm5uanp6daWloAAACnp6dzc3MhISEAAADm5ube3t61tbVzc3Nra2tmZmZSUlIZGRkAAADMzMwZGRkAAADFxcV7e3vv7+/m5uY6OjopKSkZGRkQEBDv7+/m5ubv7++tra2VlZV7e3tSUlLm5ubW1tZra2tmZmaEhIR7e3v39/fMzMytra2ZmZn39/fm5ubMzMytra3////39/fv7+/m5ubW1tbMzMz////39/fv7+/m5ube3t7W1tbMzMzFxcW9vb21tbWtra2np6eZmZmVlZWLi4uEhIR7e3tzc3Nra2tmZmZaWlpSUlJKSkpCQkI6OjozMzMpKSkhISEZGRkQEBCrXBb0AAAAWnRSTlMAERERESIiIiIzMzMzREREREREREREVVVVZmZ3d3d3d3eIiJmZmZmZqqqqqru7zMzMzN3d3d3u7u7u7u7///////////////////////////////////////+x1Mn8AAAACXBIWXMAAArrAAAK6wGCiw1aAAAAFnRFWHRDcmVhdGlvbiBUaW1lADAzLzE5LzEz70/7PAAAABx0RVh0U29mdHdhcmUAQWRvYmUgRmlyZXdvcmtzIENTNXG14zYAAAKiSURBVDiNdZSHVuJAFIbHNVawN2zY29oLljgJuhBYCdlJmIbv/yJ7p0RDgv/hcJjJx3/nlglCWY3MHFw9YtDj1cHMCPpJY5t3OKO7zbGh2K+9J5zT096vIjdr3N7bnS6o0343rrN5bktt+y2S9KhWLyGBr/a2Brl9tRcQ2suIkkDt7uf9/JANcECy0B/0XIXlW8R6BbHoDR6tptw4pOtHtMjBgSPwfBq34CnGXjfHJYkOTlnkYXxquDn42aZ5K8oYV5J/wWYuNazHgyBViNCgoG/WcuoZDG0ipN2CEoGVCH0/MqT8wPh5CsB1yCS2EaEdHpHwMIRkPWpICvmsIzR6hnHDBiaeqmcsRaj7R6UJ3sT4bBRN3GP8kZ6tqZ57cVdzgbSnhL/dT6BpKGJkI1NqSMP1+9wohlJOo3nYi9NGCN5MR6wpU45TWM6jhW9QZcsDnPPjvAfrhQyoiydNHjj+5D+ACdU17pgDQgskz4ZeQIvwTdLAovV1DfxvMoHlIlp6wThMA7fN+QJDmupwAdV6WUKla4xbUHC1k9g8pM7dZ7aO8PfrEnIO4UDG0ICQrzRVsp3hMBWHDkIbcPyQ6pligepHXyUFpG/mR8BEehswFKUHjP+Y2RP8HzF1hvQ71FRSNDB+KAHoHIFl1/a//2nDCSn72lBG0NMjRw3ksgv33o5UQYLC6LnLesKdY9Xa4RzXaR075tKUb2DRGs6pDtyU7S101l6VJytEF0z5va456cV2tl31fiJCZjEpiHpTudtfnCKVJ24BmvYNMN341ywHZLWmZ7vRIUyAGOk09BzVqgMckJXLuu60V9cy01a/rOQ4IMs7t+7gC9e93SkXOIWu7F7UXN+Oo1u72F0Zhml0slI9Of99Dp+TamXyJ8yyZa0C9R+sB1cOQt9FSwAAAABJRU5ErkJggg=="

    invoke-static {v0}, Lnet/youmi/android/a/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->a:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->a:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "4a45574c6f545557505d3d5d460a5d6b56580812535a15"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->a:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->b:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "4a45574c74564055716c"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->b:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->c:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "4a45574c74564055"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->c:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->d:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->d:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "6a45574c7173"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->d:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->d:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static f()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->e:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "7a79737c716375"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->e:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static g()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->f:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->f:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "6a7d776f74766075"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->f:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->f:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static h()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->g:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->g:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e545b43195642481b5a140850185b03121f56000d5651401b100719160647"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->g:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static i()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->h:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b14564702"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->h:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static j()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->i:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->i:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b155b41"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->i:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->i:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->j:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->j:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b055f5d"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->j:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->j:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static l()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->k:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->k:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b04405e13"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->k:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->k:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static m()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->l:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->l:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b04505a0f"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->l:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->l:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static n()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->m:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->m:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b041116454509121f550e101742001b025a"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->m:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->m:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static o()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->n:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->n:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b0411165956020f491b000c4b1b440549415315"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->n:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->n:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static p()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->o:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->o:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b0411165956020f491b000c4b1b440549415315"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->o:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->o:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static q()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->p:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->p:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "ddge66nGU1e7a"

    const-string v1, "0e1540480e4d1e471a495844580f4c5b0411165956020f491b000c4b1b440549575f"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->p:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->p:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static r()Ljava/lang/String;
    .locals 2

    :try_start_0
    sget-object v0, Lnet/youmi/android/c/a/c;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->q:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/c/a/c;->q:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "android"

    const-string v1, "5b54565655456b474c5916526a"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/c/a/c;->q:Ljava/lang/String;

    sget-object v0, Lnet/youmi/android/c/a/c;->q:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
