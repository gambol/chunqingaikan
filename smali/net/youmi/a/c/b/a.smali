.class public Lnet/youmi/android/a/c/b/a;
.super Lnet/youmi/android/a/b/e/a;


# static fields
.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/c/b/a;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    return-void
.end method

.method private static a()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "FTZNgRJZOBk5"

    const-string v1, "3c5b4c5859635209"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "Test"

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, p0, v3}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, p1, p0, v2}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, p1}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 4

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, p0, v2, v3}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 0

    sput-boolean p0, Lnet/youmi/android/a/c/b/a;->a:Z

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 4

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, p0, v3}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, p1, p0, v2}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, p1}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/Throwable;)V
    .locals 4

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, p0, v2, v3}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 4

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, p0, v3}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, p1}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 4

    sget-boolean v0, Lnet/youmi/android/a/c/b/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    sget-object v1, Lnet/youmi/android/a/c/b/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, p0, v3}, Lnet/youmi/android/a/c/b/a;->a(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
