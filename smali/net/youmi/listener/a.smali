.class public Lnet/youmi/android/listener/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lnet/youmi/android/listener/a;


# instance fields
.field private b:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/listener/a;
    .locals 2

    const-class v1, Lnet/youmi/android/listener/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/listener/a;->a:Lnet/youmi/android/listener/a;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/listener/a;

    invoke-direct {v0}, Lnet/youmi/android/listener/a;-><init>()V

    sput-object v0, Lnet/youmi/android/listener/a;->a:Lnet/youmi/android/listener/a;

    :cond_0
    sget-object v0, Lnet/youmi/android/listener/a;->a:Lnet/youmi/android/listener/a;
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
.method public a(ILnet/youmi/android/listener/Interface_ActivityListener;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->b()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->b()Landroid/util/SparseArray;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/listener/Interface_ActivityListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lnet/youmi/android/listener/Interface_ActivityListener;->onActivityDestroy(Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->b()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected declared-synchronized b()Landroid/util/SparseArray;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/listener/a;->b:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/listener/a;->b:Landroid/util/SparseArray;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/listener/a;->b:Landroid/util/SparseArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->b()Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->b()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/listener/a;->b()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    :cond_0
    return-void
.end method
