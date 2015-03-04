.class public Lnet/youmi/android/a/a/e/f/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:Landroid/content/Context;

.field b:J

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:J

.field h:Z

.field i:Ljava/lang/String;

.field j:Z

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;I)V
    .locals 3

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lnet/youmi/android/a/a/e/f/d;->h:Z

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->i:Ljava/lang/String;

    iput-boolean v1, p0, Lnet/youmi/android/a/a/e/f/d;->j:Z

    iput v1, p0, Lnet/youmi/android/a/a/e/f/d;->k:I

    iput-object p1, p0, Lnet/youmi/android/a/a/e/f/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/f/d;->e:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/f/d;->d:Ljava/lang/String;

    iput-object p4, p0, Lnet/youmi/android/a/a/e/f/d;->f:Ljava/lang/String;

    iput-wide p5, p0, Lnet/youmi/android/a/a/e/f/d;->b:J

    iput-wide p7, p0, Lnet/youmi/android/a/a/e/f/d;->g:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/e/f/d;->h:Z

    iput-boolean p9, p0, Lnet/youmi/android/a/a/e/f/d;->j:Z

    iput-object p10, p0, Lnet/youmi/android/a/a/e/f/d;->i:Ljava/lang/String;

    iput p11, p0, Lnet/youmi/android/a/a/e/f/d;->k:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;I)V
    .locals 3

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lnet/youmi/android/a/a/e/f/d;->h:Z

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->i:Ljava/lang/String;

    iput-boolean v1, p0, Lnet/youmi/android/a/a/e/f/d;->j:Z

    iput v1, p0, Lnet/youmi/android/a/a/e/f/d;->k:I

    iput-object p1, p0, Lnet/youmi/android/a/a/e/f/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/f/d;->e:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/f/d;->d:Ljava/lang/String;

    iput-object p4, p0, Lnet/youmi/android/a/a/e/f/d;->f:Ljava/lang/String;

    iput-wide p5, p0, Lnet/youmi/android/a/a/e/f/d;->b:J

    iput-boolean v1, p0, Lnet/youmi/android/a/a/e/f/d;->h:Z

    iput-boolean p7, p0, Lnet/youmi/android/a/a/e/f/d;->j:Z

    iput-object p8, p0, Lnet/youmi/android/a/a/e/f/d;->i:Ljava/lang/String;

    iput p9, p0, Lnet/youmi/android/a/a/e/f/d;->k:I

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 6

    iget-boolean v0, p0, Lnet/youmi/android/a/a/e/f/d;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/f/d;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/e/b/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->c:Ljava/lang/String;

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    new-instance v0, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v0}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    iget-object v1, p0, Lnet/youmi/android/a/a/e/f/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    iget v1, p0, Lnet/youmi/android/a/a/e/f/d;->k:I

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/e/f/d;->a:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/f/d;->f:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lnet/youmi/android/a/a/e/f/d;->h:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnet/youmi/android/a/a/e/f/d;->a:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/f/d;->f:Ljava/lang/String;

    iget-wide v4, p0, Lnet/youmi/android/a/a/e/f/d;->g:J

    invoke-static {v1, v2, v0, v4, v5}, Lnet/youmi/android/a/a/e/b/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    :cond_1
    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->c:Ljava/lang/String;

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    goto :goto_0
.end method

.method protected a(I)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/d;->c:Ljava/lang/String;

    :cond_0
    const-string v0, "javascript:%s(%d,%d,\'%s\',\'%s\')"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lnet/youmi/android/a/a/e/f/d;->d:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-wide v4, p0, Lnet/youmi/android/a/a/e/f/d;->b:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lnet/youmi/android/a/a/e/f/d;->f:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lnet/youmi/android/a/a/e/f/d;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/a/e/f/d;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public run()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/a/e/f/d;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/a/e/f/d;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
