.class public Lnet/youmi/android/a/a/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method public static final a()Ljava/lang/String;
    .locals 2

    sget-object v0, Lnet/youmi/android/a/a/a;->a:Ljava/lang/String;

    const-string v1, "417e606d53634d5101080a517928555d"

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "android"

    invoke-static {p0, p1, v0}, Lnet/youmi/android/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-static {p0, p1, p2, v0}, Lnet/youmi/android/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    move-object p3, v0

    :cond_0
    :goto_1
    return-object p3

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, p0

    goto :goto_0
.end method
