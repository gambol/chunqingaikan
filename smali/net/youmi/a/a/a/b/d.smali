.class public Lnet/youmi/android/a/a/a/b/d;
.super Lnet/youmi/android/a/b/c/h;


# static fields
.field private static a:Lnet/youmi/android/a/a/a/b/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "aJoW5pml"

    invoke-static {p1}, Lnet/youmi/android/a/a/b/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/c/g;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lnet/youmi/android/a/b/c/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/c/g;)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lnet/youmi/android/a/a/a/b/d;
    .locals 2

    const-class v1, Lnet/youmi/android/a/a/a/b/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/a/a/b/d;->a:Lnet/youmi/android/a/a/a/b/d;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/a/b/d;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/a/b/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/a/b/d;->a:Lnet/youmi/android/a/a/a/b/d;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/a/a/b/d;->a:Lnet/youmi/android/a/a/a/b/d;
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
.method public a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/a/a/b/b;)Lnet/youmi/android/a/a/a/b/a;
    .locals 2

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/a/b/a;

    invoke-direct {v0, p2, p3}, Lnet/youmi/android/a/a/a/b/a;-><init>(Ljava/lang/String;Lnet/youmi/android/a/a/a/b/b;)V

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/a/b/d;->b(Lnet/youmi/android/a/b/c/d;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Lnet/youmi/android/a/a/a/b/a;)Z
    .locals 1

    invoke-virtual {p0, p2}, Lnet/youmi/android/a/a/a/b/d;->a(Lnet/youmi/android/a/b/c/d;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/a/b/d;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
