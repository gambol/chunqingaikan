.class public abstract Lnet/youmi/android/a/b/g/c;
.super Lnet/youmi/android/a/b/j/a;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/b;
.implements Lnet/youmi/android/a/b/g/d/c;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/b/g/c/a;

.field private c:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V
    .locals 2

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/c;->a:Landroid/content/Context;

    if-nez p2, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cache Directory is null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p2, p0, Lnet/youmi/android/a/b/g/c;->b:Lnet/youmi/android/a/b/g/c/a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/b/g/e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private o(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method protected abstract a(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 12

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :try_start_1
    invoke-virtual/range {p0 .. p8}, Lnet/youmi/android/a/b/g/c;->b(Lnet/youmi/android/a/b/g/e/a;JJIJ)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    move v9, v0

    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-ge v9, v0, :cond_0

    :try_start_2
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    move-object v1, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move-wide/from16 v7, p7

    invoke-interface/range {v0 .. v8}, Lnet/youmi/android/a/b/g/d/c;->a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lnet/youmi/android/a/b/g/e/a;

    invoke-direct {v1, p1}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lnet/youmi/android/a/b/g/e/a;->d()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lnet/youmi/android/a/b/g/c;->b:Lnet/youmi/android/a/b/g/c/a;

    invoke-virtual {v1}, Lnet/youmi/android/a/b/g/e/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/g/c/a;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/g/e/a;->a(Ljava/io/File;)V

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v2

    iget-object v3, p0, Lnet/youmi/android/a/b/g/c;->a:Landroid/content/Context;

    invoke-virtual {v2, v3, v1, p0}, Lnet/youmi/android/a/b/g/e;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected abstract b(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract b(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
.end method

.method public c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c;->a(Lnet/youmi/android/a/b/g/e/a;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->c(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c;->c:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c;->b(Lnet/youmi/android/a/b/g/e/a;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->d(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/c;->o(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c;->k(Lnet/youmi/android/a/b/g/e/a;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->e(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public f(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/c;->o(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c;->l(Lnet/youmi/android/a/b/g/e/a;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->f(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public g(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/c;->o(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c;->n(Lnet/youmi/android/a/b/g/e/a;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v2

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->g(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public g_(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/c;->o(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/c;->m(Lnet/youmi/android/a/b/g/e/a;)V

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->h_(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public i(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected abstract k(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract l(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract m(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract n(Lnet/youmi/android/a/b/g/e/a;)V
.end method
