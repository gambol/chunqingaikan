.class public Lnet/youmi/android/a/a/g/c/a;
.super Lnet/youmi/android/a/a/d/a;


# static fields
.field private static e:Lnet/youmi/android/a/a/g/c/a;


# instance fields
.field a:Lnet/youmi/android/a/a/g/c/g;

.field b:Lnet/youmi/android/a/a/g/c/d;

.field c:Lnet/youmi/android/a/a/g/c/e;

.field private f:Landroid/util/SparseArray;

.field private g:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/d/a;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->f:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->g:Landroid/util/SparseArray;

    new-instance v0, Lnet/youmi/android/a/a/g/c/g;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/c/g;-><init>(Lnet/youmi/android/a/a/g/c/a;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->a:Lnet/youmi/android/a/a/g/c/g;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->a:Lnet/youmi/android/a/a/g/c/g;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/g/c/a;->a(Ljava/lang/Object;)V

    new-instance v0, Lnet/youmi/android/a/a/g/c/d;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lnet/youmi/android/a/a/g/c/d;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/c/a;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->b:Lnet/youmi/android/a/a/g/c/d;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->b:Lnet/youmi/android/a/a/g/c/d;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/g/c/a;->a(Ljava/lang/Object;)V

    new-instance v0, Lnet/youmi/android/a/a/g/c/e;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lnet/youmi/android/a/a/g/c/e;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/c/a;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->c:Lnet/youmi/android/a/a/g/c/e;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->c:Lnet/youmi/android/a/a/g/c/e;

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/g/c/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/c/a;
    .locals 2

    const-class v1, Lnet/youmi/android/a/a/g/c/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/c/a;->e:Lnet/youmi/android/a/a/g/c/a;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/c/a;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/c/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/c/a;->e:Lnet/youmi/android/a/a/g/c/a;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/c/a;->e:Lnet/youmi/android/a/a/g/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private r(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/b;
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/a/g/c/a;->f_(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/a;->g()Lnet/youmi/android/a/a/e/g/b;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/a/a/e/g/b;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/a;->g()Lnet/youmi/android/a/a/e/g/b;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/g/a;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/a;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/youmi/android/a/a/e/g/f;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->a:Lnet/youmi/android/a/a/g/c/g;

    invoke-virtual {v2, v0, v1}, Lnet/youmi/android/a/a/g/c/g;->a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/a/e/g/a;Lnet/youmi/android/a/a/e/g/f;)V
    .locals 4

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/a/e/g/a;->f()Lnet/youmi/android/a/a/a/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/a;->i()Lnet/youmi/android/a/a/a/a/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/d;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->g:Landroid/util/SparseArray;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    if-eqz p2, :cond_2

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->f:Landroid/util/SparseArray;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Lnet/youmi/android/a/a/a/a/d;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1, v0}, Lnet/youmi/android/a/a/g/c/a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v1}, Lnet/youmi/android/a/a/g/c/a;->a(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Lnet/youmi/android/a/a/d/a;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method protected a_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/c/a;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/a;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->b:Lnet/youmi/android/a/a/g/c/d;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->a:Lnet/youmi/android/a/a/g/c/g;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->c:Lnet/youmi/android/a/a/g/c/e;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    if-nez v2, :cond_2

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v2

    new-instance v3, Lnet/youmi/android/a/a/g/c/b;

    invoke-direct {v3, p0, v0, p1}, Lnet/youmi/android/a/a/g/c/b;-><init>(Lnet/youmi/android/a/a/g/c/a;Lnet/youmi/android/a/b/g/d/a;I)V

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/a;->r(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/b;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/f;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/a;->d:Landroid/content/Context;

    const/4 v3, 0x6

    invoke-direct {v1, v2, v0, v3}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)V

    invoke-static {v1}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2}, Lnet/youmi/android/a/a/d/a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method protected b_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    new-instance v0, Lnet/youmi/android/a/a/g/c/m;

    invoke-direct {v0, p0, p1}, Lnet/youmi/android/a/a/g/c/m;-><init>(Lnet/youmi/android/a/a/g/c/a;Lnet/youmi/android/a/b/g/e/a;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/a;->r(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/b;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/f;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-direct {v1, v2, v0, v3}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I)V

    invoke-static {v1}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x7
    .end array-data
.end method

.method protected c_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method protected d_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method protected e_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    new-instance v0, Lnet/youmi/android/a/a/g/c/m;

    invoke-direct {v0, p0, p1}, Lnet/youmi/android/a/a/g/c/m;-><init>(Lnet/youmi/android/a/a/g/c/a;Lnet/youmi/android/a/b/g/e/a;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/a;->r(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/b;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/f;

    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/c/a;->b()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x7

    invoke-direct {v1, v2, v0, v3}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)V

    invoke-static {v1}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method f_(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;
    .locals 2

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->g:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/g/a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method h(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/f;
    .locals 2

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/a;->f:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/g/f;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method j(Lnet/youmi/android/a/b/g/e/a;)I
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
