.class public Lnet/youmi/android/spot/f;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/e/g/c;

    const/4 v1, 0x2

    const/16 v2, 0x1f4

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    invoke-virtual {v0, p2}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lnet/youmi/android/AdBrowser;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "aca5522945c72310f9f22b333c68f2b3"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {p0, p2}, Lnet/youmi/android/c/a/t;->a(Landroid/content/Context;Ljava/lang/String;)Z

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    const/4 v1, 0x1

    invoke-static {p0, p3}, Lnet/youmi/android/a/b/k/j;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p3}, Lnet/youmi/android/a/b/k/h;->b(Landroid/content/Context;Ljava/lang/String;)Z

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lnet/youmi/android/a/a/e/g/a;

    invoke-direct {v0}, Lnet/youmi/android/a/a/e/g/a;-><init>()V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/a;->b(Z)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/a;->a(Z)V

    invoke-virtual {v0, p7}, Lnet/youmi/android/a/a/e/g/a;->b(Ljava/lang/String;)V

    invoke-virtual {v0, p8}, Lnet/youmi/android/a/a/e/g/a;->c(Ljava/lang/String;)V

    new-instance v1, Lnet/youmi/android/a/a/a/a/a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lnet/youmi/android/a/a/a/a/a;-><init>(II)V

    new-instance v2, Lnet/youmi/android/a/a/a/a/d;

    invoke-direct {v2}, Lnet/youmi/android/a/a/a/a/d;-><init>()V

    invoke-virtual {v2, p6}, Lnet/youmi/android/a/a/a/a/d;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/a/a/a;->a(Lnet/youmi/android/a/a/a/a/d;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/a;->a(Lnet/youmi/android/a/a/a/a/a;)V

    new-instance v2, Lnet/youmi/android/a/a/a/a/g;

    invoke-direct {v2}, Lnet/youmi/android/a/a/a/a/g;-><init>()V

    invoke-virtual {v2, p3}, Lnet/youmi/android/a/a/a/a/g;->b(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Lnet/youmi/android/a/a/a/a/g;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/a/a/a;->a(Lnet/youmi/android/a/a/a/a/g;)V

    new-instance v1, Lnet/youmi/android/a/a/e/g/b;

    invoke-direct {v1}, Lnet/youmi/android/a/a/e/g/b;-><init>()V

    invoke-virtual {v1, p4}, Lnet/youmi/android/a/a/e/g/b;->b(Ljava/lang/String;)V

    sget-object v2, Lnet/youmi/android/c/a/b;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/b;->a(Ljava/lang/String;)V

    invoke-virtual {v1, p5}, Lnet/youmi/android/a/a/e/g/b;->c(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "entc="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/b;->d(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/a;->a(Lnet/youmi/android/a/a/e/g/b;)V

    invoke-static {p0}, Lnet/youmi/android/a/a/g/c/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/c/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lnet/youmi/android/a/a/g/c/a;->a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 10

    :try_start_0
    new-instance v1, Lnet/youmi/android/spot/g;

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move/from16 v5, p6

    move-wide v6, p4

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, Lnet/youmi/android/spot/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLandroid/content/Context;)V

    invoke-static {v1}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
