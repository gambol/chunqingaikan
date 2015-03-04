.class public Lnet/youmi/android/a/a/j/a/b;
.super Lnet/youmi/android/a/b/j/a;


# static fields
.field private static a:Lnet/youmi/android/a/a/j/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/a/a/j/a/b;
    .locals 2

    const-class v1, Lnet/youmi/android/a/a/j/a/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/j/a/b;->a:Lnet/youmi/android/a/a/j/a/b;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/j/a/b;

    invoke-direct {v0}, Lnet/youmi/android/a/a/j/a/b;-><init>()V

    sput-object v0, Lnet/youmi/android/a/a/j/a/b;->a:Lnet/youmi/android/a/a/j/a/b;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/j/a/b;->a:Lnet/youmi/android/a/a/j/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/j/a/d;

    invoke-direct {v2, p0, v0, p1}, Lnet/youmi/android/a/a/j/a/d;-><init>(Lnet/youmi/android/a/a/j/a/b;Ljava/util/List;I)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/j/a/c;

    invoke-direct {v2, p0, v0, p1}, Lnet/youmi/android/a/a/j/a/c;-><init>(Lnet/youmi/android/a/a/j/a/b;Ljava/util/List;Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public b()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(I)V
    .locals 3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/j/a/e;

    invoke-direct {v2, p0, v0, p1}, Lnet/youmi/android/a/a/j/a/e;-><init>(Lnet/youmi/android/a/a/j/a/b;Ljava/util/List;I)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/j/a/f;

    invoke-direct {v2, p0, v0, p1}, Lnet/youmi/android/a/a/j/a/f;-><init>(Lnet/youmi/android/a/a/j/a/b;Ljava/util/List;Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public c(I)V
    .locals 3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/j/a/b;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/j/a/g;

    invoke-direct {v2, p0, v0, p1}, Lnet/youmi/android/a/a/j/a/g;-><init>(Lnet/youmi/android/a/a/j/a/b;Ljava/util/List;I)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
