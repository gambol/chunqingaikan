.class public Lnet/youmi/android/a/a/g/e/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    invoke-static {}, Lnet/youmi/android/a/c/c/a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lnet/youmi/android/a/b/k/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/a/g/e/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZI)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/e/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/a/a/g/e/a;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lnet/youmi/android/a/a/g/e/a;->e:Z

    iput p5, p0, Lnet/youmi/android/a/a/g/e/a;->d:I

    return-void
.end method

.method private static a(Landroid/content/Context;)V
    .locals 4

    :try_start_0
    const-string v0, "*****"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;)V

    const-string v0, "Current SDK Version is %s Android SDK w%s, s%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lnet/youmi/android/a/a/g/e/a;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "5.0.0"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "5.0.0"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "App ID : %s "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "App Sec : %s "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v0, "App Name : %s "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/b/k/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_5

    :goto_0
    :try_start_2
    const-string v0, "App PackageName : %s "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "App Version Code : %d "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "App Version Name : %s "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_4

    :goto_1
    :try_start_3
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->g(Landroid/content/Context;)I

    move-result v0

    if-lez v0, :cond_0

    const-string v1, "Promotion Channel ID : %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3

    :cond_0
    :goto_2
    :try_start_4
    const-string v0, "Test Mode : %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lnet/youmi/android/a/c/c/a;->b()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2

    :goto_3
    :try_start_5
    const-string v0, "SDK Core Build Version : %d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const v3, 0x780d0a35

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1

    :goto_4
    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_1

    :catch_5
    move-exception v0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Z)V
    .locals 1

    if-nez p0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/a/g/e/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    :goto_1
    :try_start_1
    invoke-static {p0}, Lnet/youmi/android/a/a/g/e/g;->a(Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    :cond_2
    :goto_2
    :try_start_2
    new-instance v0, Lnet/youmi/android/a/a/g/e/k;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/e/k;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3

    :cond_3
    :goto_3
    :try_start_3
    new-instance v0, Lnet/youmi/android/a/a/g/e/m;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/e/m;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_4

    :cond_4
    :goto_4
    :try_start_4
    new-instance v0, Lnet/youmi/android/a/a/g/d/a/g;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/d/a/g;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_5

    :goto_5
    :try_start_5
    new-instance v0, Lnet/youmi/android/a/a/g/e/n;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/e/n;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    if-eqz p1, :cond_1

    const-string v0, "\u6253\u5370\u542f\u52a8\u4fe1\u606f\u5931\u8d25"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_1

    :catch_2
    move-exception v0

    if-eqz p1, :cond_2

    const-string v0, "\u6ce8\u518c\u5378\u8f7d\u76d1\u542c\u5931\u8d25"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_2

    :catch_3
    move-exception v0

    if-eqz p1, :cond_3

    const-string v0, "\u6e05\u9664\u8fc7\u671f\u7684\u7f13\u5b58\u5931\u8d25"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_3

    :catch_4
    move-exception v0

    if-eqz p1, :cond_4

    const-string v0, "\u521d\u59cb\u5316\u63a5\u53e3\u5931\u8d25"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->d(Ljava/lang/String;)V

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_5
.end method

.method private static b()Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "yKl76nGU1e7a"

    const-string v1, "3c5641545e"

    invoke-static {v1, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    iget-boolean v0, p0, Lnet/youmi/android/a/a/g/e/a;->e:Z

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->a(Z)V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iget v1, p0, Lnet/youmi/android/a/a/g/e/a;->d:I

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;I)V

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/h/e;->l(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/g/e/a;->a(Landroid/content/Context;Z)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    iget-boolean v0, p0, Lnet/youmi/android/a/a/g/e/a;->e:Z

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->a(Z)V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    iget v1, p0, Lnet/youmi/android/a/a/g/e/a;->d:I

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/h/e;->l(Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    :try_start_2
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/a;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/g/e/a;->a(Landroid/content/Context;Z)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
