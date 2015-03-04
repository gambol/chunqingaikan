.class public Lnet/youmi/android/a/a/g/a/f;
.super Lnet/youmi/android/a/b/j/a;


# static fields
.field private static a:Lnet/youmi/android/a/a/g/a/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/a/a/g/a/f;
    .locals 2

    const-class v1, Lnet/youmi/android/a/a/g/a/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/f;->a:Lnet/youmi/android/a/a/g/a/f;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/a/f;

    invoke-direct {v0}, Lnet/youmi/android/a/a/g/a/f;-><init>()V

    sput-object v0, Lnet/youmi/android/a/a/g/a/f;->a:Lnet/youmi/android/a/a/g/a/f;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/a/f;->a:Lnet/youmi/android/a/a/g/a/f;
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
.method public a(Ljava/lang/String;II)V
    .locals 3

    invoke-virtual {p0}, Lnet/youmi/android/a/a/g/a/f;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_0
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/a/e;

    invoke-interface {v0, p1, p2, p3}, Lnet/youmi/android/a/a/g/a/e;->a(Ljava/lang/String;II)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method
