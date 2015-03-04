.class Lnet/youmi/android/onlineconfig/c;
.super Lnet/youmi/android/a/b/c/h;


# static fields
.field private static a:Lnet/youmi/android/onlineconfig/c;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "dTW3KThJ"

    invoke-static {p1}, Lnet/youmi/android/a/a/b/a;->b(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lnet/youmi/android/a/b/c/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    return-void
.end method

.method static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/onlineconfig/c;
    .locals 2

    const-class v1, Lnet/youmi/android/onlineconfig/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/onlineconfig/c;->a:Lnet/youmi/android/onlineconfig/c;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/onlineconfig/c;

    invoke-direct {v0, p0}, Lnet/youmi/android/onlineconfig/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/onlineconfig/c;->a:Lnet/youmi/android/onlineconfig/c;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/onlineconfig/c;->a:Lnet/youmi/android/onlineconfig/c;
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
.method a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/onlineconfig/a;

    invoke-direct {v0, p1}, Lnet/youmi/android/onlineconfig/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/onlineconfig/c;->b(Lnet/youmi/android/a/b/c/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/onlineconfig/a;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/onlineconfig/a;->a()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    :cond_0
    :goto_0
    return-object p2

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 1

    :try_start_0
    new-instance v0, Lnet/youmi/android/onlineconfig/a;

    invoke-direct {v0, p1}, Lnet/youmi/android/onlineconfig/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lnet/youmi/android/onlineconfig/a;->b(Ljava/lang/String;)V

    invoke-virtual {v0, p3, p4}, Lnet/youmi/android/onlineconfig/a;->a(J)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/onlineconfig/c;->a(Lnet/youmi/android/a/b/c/d;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
