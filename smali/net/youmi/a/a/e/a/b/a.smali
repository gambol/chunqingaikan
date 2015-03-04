.class public Lnet/youmi/android/a/a/e/a/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/a/b/h;


# instance fields
.field protected a:Landroid/app/Activity;

.field protected b:Landroid/content/Context;

.field protected c:Lnet/youmi/android/a/a/i/a/b/a;

.field protected d:Lnet/youmi/android/a/a/e/g/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/i/a/b/a;Lnet/youmi/android/a/a/e/g/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->b:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    return-void
.end method


# virtual methods
.method protected a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->b:Landroid/content/Context;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->h()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->k()I

    move-result v1

    invoke-static {v0, p1, p2, v1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ILnet/youmi/android/a/a/e/g/b;)Lnet/youmi/android/a/a/e/a;
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/g/d/a/f;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/b/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p2, p1}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Ljava/util/List;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    invoke-static {p1, p2}, Lnet/youmi/android/a/a/g/e/c;->a(Landroid/content/Context;Ljava/util/List;)V

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)Lnet/youmi/android/a/a/e/a;
    .locals 2

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/e/a/b/e;

    invoke-direct {v1, p0, p1, p2}, Lnet/youmi/android/a/a/e/a/b/e;-><init>(Lnet/youmi/android/a/a/e/a/b/a;Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/c;)Lnet/youmi/android/a/a/e/a;
    .locals 5

    const/4 v4, -0x1

    if-nez p1, :cond_0

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    instance-of v0, v0, Lnet/youmi/android/a/a/e/g/g;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    check-cast v0, Lnet/youmi/android/a/a/e/g/g;

    new-instance v1, Lnet/youmi/android/a/a/e/g/g;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->l()I

    move-result v2

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->k()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lnet/youmi/android/a/a/e/g/g;-><init>(II)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->v()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->g(I)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->u()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->f(I)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->d(I)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->t()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->e(I)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->x()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lnet/youmi/android/a/a/e/g/g;->a(D)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->y()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lnet/youmi/android/a/a/e/g/g;->b(D)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->a(I)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->b(I)V

    :goto_1
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    iget v2, v2, Lnet/youmi/android/a/a/j/a;->e:I

    if-eq v2, v4, :cond_2

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v3

    iget v3, v3, Lnet/youmi/android/a/a/j/a;->e:I

    iput v3, v2, Lnet/youmi/android/a/a/j/a;->e:I

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/j/a;)V

    :goto_2
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->d(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->w()Z

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->a(Z)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->g(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/e/a/a/b;)V

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/e/a/b/a;->b(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->b(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto/16 :goto_0

    :cond_2
    :try_start_1
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/j/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/g;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/j/a;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    new-instance v1, Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->l()I

    move-result v2

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->k()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->a(I)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    :goto_3
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    iget v2, v2, Lnet/youmi/android/a/a/j/a;->e:I

    if-eq v2, v4, :cond_6

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v3

    iget v3, v3, Lnet/youmi/android/a/a/j/a;->e:I

    iput v3, v2, Lnet/youmi/android/a/a/j/a;->e:I

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V

    :goto_4
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->g(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/e/a/a/b;)V

    new-instance v0, Lnet/youmi/android/a/a/e/g/d;

    invoke-direct {v0}, Lnet/youmi/android/a/a/e/g/d;-><init>()V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/d;->a(Lnet/youmi/android/a/a/e/g/c;)Z

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/e/a/b/a;->a(Lnet/youmi/android/a/a/e/g/d;)Lnet/youmi/android/a/a/e/a;

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->b(I)V

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->j()Lnet/youmi/android/a/a/j/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/j/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4
.end method

.method public a(Lnet/youmi/android/a/a/e/g/d;)Lnet/youmi/android/a/a/e/a;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Lnet/youmi/android/a/a/e/g/d;->a(I)Lnet/youmi/android/a/a/e/g/c;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/e/g/c;->a(Lnet/youmi/android/a/a/e/a/a/b;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    const-class v3, Lnet/youmi/android/AdBrowser;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_1
    const-string v2, "aca5522945c72310f9f22b333c68f2b3"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/a/b/a;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    :goto_2
    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    return-object v0

    :cond_2
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/a/b/a;->b:Landroid/content/Context;

    const-class v3, Lnet/youmi/android/AdBrowser;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/a;->a:Lnet/youmi/android/a/a/e/a;

    return-object v0
.end method

.method public a(Lnet/youmi/android/a/a/i/a/b/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    return-void
.end method

.method public b(Lnet/youmi/android/a/a/e/g/g;)Lnet/youmi/android/a/a/e/a;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    if-nez v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/g;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->h()Lnet/youmi/android/a/a/e/a/a/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/a/e/g/g;->a(Lnet/youmi/android/a/a/e/a/a/b;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    :try_start_2
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/i/a/a/e;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    invoke-direct {v1, v2, p1}, Lnet/youmi/android/a/a/i/a/a/e;-><init>(Landroid/app/Activity;Lnet/youmi/android/a/a/e/g/g;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_2
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public c(I)Lnet/youmi/android/a/a/e/a;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    const/4 v1, -0x1

    const/high16 v2, -0x40800000    # -1.0f

    invoke-interface {v0, p1, v1, v2}, Lnet/youmi/android/a/a/i/a/b/a;->a(IIF)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public g()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->a:Landroid/app/Activity;

    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method public i()Lnet/youmi/android/a/a/e/a;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_0
.end method

.method public j()Lnet/youmi/android/a/a/e/a;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_4

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    invoke-interface {v0}, Lnet/youmi/android/a/a/i/a/b/a;->m()Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->m()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v2}, Lnet/youmi/android/a/a/e/g/c;->n()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BASE64"

    invoke-static {v2, v3}, Lorg/apache/http/util/EncodingUtils;->getBytes(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lnet/youmi/android/a/a/i/a/b/a;->a(Ljava/lang/String;[B)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    return-object v0

    :cond_0
    :try_start_3
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/e/a/b/b;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/e/a/b/b;-><init>(Lnet/youmi/android/a/a/e/a/b/a;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_4
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/e/a/b/c;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/e/a/b/c;-><init>(Lnet/youmi/android/a/a/e/a/b/a;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    goto :goto_1

    :cond_2
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->c:Lnet/youmi/android/a/a/i/a/b/a;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/c;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/youmi/android/a/a/i/a/b/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;

    goto :goto_1

    :cond_3
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/e/a/b/d;

    invoke-direct {v1, p0}, Lnet/youmi/android/a/a/e/a/b/d;-><init>(Lnet/youmi/android/a/a/e/a/b/a;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lnet/youmi/android/a/a/e/a;->b:Lnet/youmi/android/a/a/e/a;
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    :cond_4
    sget-object v0, Lnet/youmi/android/a/a/e/a;->c:Lnet/youmi/android/a/a/e/a;

    goto :goto_1
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->e()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->f()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/a/b/a;->d:Lnet/youmi/android/a/a/e/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/c;->g()I

    move-result v0

    return v0
.end method
