.class public Lnet/youmi/android/a/b/g/b/c;
.super Lnet/youmi/android/a/b/g/b/a;


# static fields
.field private static a:Lnet/youmi/android/a/b/g/b/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/a/b/g/b/a;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/a/b/g/b/c;
    .locals 2

    const-class v1, Lnet/youmi/android/a/b/g/b/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/b/g/b/c;->a:Lnet/youmi/android/a/b/g/b/c;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/b/c;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/b/c;-><init>()V

    sput-object v0, Lnet/youmi/android/a/b/g/b/c;->a:Lnet/youmi/android/a/b/g/b/c;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/b/g/b/c;->a:Lnet/youmi/android/a/b/g/b/c;
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
.method public a(Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
