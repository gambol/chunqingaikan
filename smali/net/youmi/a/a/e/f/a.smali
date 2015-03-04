.class public Lnet/youmi/android/a/a/e/f/a;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/a/e/d/a;


# static fields
.field private static a:Lnet/youmi/android/a/a/e/f/a;


# instance fields
.field private b:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lnet/youmi/android/a/a/e/f/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/e/f/a;->a:Lnet/youmi/android/a/a/e/f/a;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/e/f/a;

    invoke-direct {v0}, Lnet/youmi/android/a/a/e/f/a;-><init>()V

    sput-object v0, Lnet/youmi/android/a/a/e/f/a;->a:Lnet/youmi/android/a/a/e/f/a;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/e/f/a;->a:Lnet/youmi/android/a/a/e/f/a;

    return-object v0
.end method

.method private declared-synchronized b()Ljava/util/HashSet;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/f/a;->b:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/a;->b:Ljava/util/HashSet;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/f/a;->b:Ljava/util/HashSet;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/a/a/e/f/a;->b()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/d/a;

    if-eqz v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, p1, p2}, Lnet/youmi/android/a/a/e/d/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v2

    new-instance v3, Lnet/youmi/android/a/a/e/f/b;

    invoke-direct {v3, p0, v0, p1, p2}, Lnet/youmi/android/a/a/e/f/b;-><init>(Lnet/youmi/android/a/a/e/f/a;Lnet/youmi/android/a/a/e/d/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_1
    move-exception v0

    :cond_2
    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/d/a;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/a/a/e/f/a;->b()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Lnet/youmi/android/a/a/e/d/a;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/a/a/e/f/a;->b()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
