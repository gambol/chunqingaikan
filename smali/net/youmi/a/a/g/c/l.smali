.class public Lnet/youmi/android/a/a/g/c/l;
.super Lnet/youmi/android/a/a/a/b/b;


# static fields
.field private static a:Lnet/youmi/android/a/a/g/c/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/a/a/b/b;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lnet/youmi/android/a/a/g/c/l;
    .locals 2

    const-class v1, Lnet/youmi/android/a/a/g/c/l;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/g/c/l;->a:Lnet/youmi/android/a/a/g/c/l;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/c/l;

    invoke-direct {v0}, Lnet/youmi/android/a/a/g/c/l;-><init>()V

    sput-object v0, Lnet/youmi/android/a/a/g/c/l;->a:Lnet/youmi/android/a/a/g/c/l;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/g/c/l;->a:Lnet/youmi/android/a/a/g/c/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected a()Lnet/youmi/android/a/a/a/b/c;
    .locals 1

    new-instance v0, Lnet/youmi/android/a/a/g/c/k;

    invoke-direct {v0}, Lnet/youmi/android/a/a/g/c/k;-><init>()V

    return-object v0
.end method
