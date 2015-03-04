.class public Lnet/youmi/android/a/a/g/e/a/b;
.super Lnet/youmi/android/a/b/j/a;


# static fields
.field private static b:Lnet/youmi/android/a/a/g/e/a/b;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/a/b;->a:Landroid/content/Context;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a/b;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/e/a/b;
    .locals 3

    const-class v1, Lnet/youmi/android/a/a/g/e/a/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/e/a/b;->b:Lnet/youmi/android/a/a/g/e/a/b;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/e/a/b;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/e/a/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/e/a/b;->b:Lnet/youmi/android/a/a/g/e/a/b;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/e/a/b;->b:Lnet/youmi/android/a/a/g/e/a/b;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "Context is null"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_1
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/g/e/a/b;->b:Lnet/youmi/android/a/a/g/e/a/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/e/a/b;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
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

    check-cast v0, Lnet/youmi/android/a/a/g/e/a/a;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lnet/youmi/android/a/a/g/e/a/a;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
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
