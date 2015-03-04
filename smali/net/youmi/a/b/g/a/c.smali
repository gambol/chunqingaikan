.class public Lnet/youmi/android/a/b/g/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/io/File;

.field private d:Ljava/io/File;

.field private e:Z

.field private f:I

.field private g:Lnet/youmi/android/a/b/g/a/a;

.field private h:I

.field private i:I

.field private j:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/io/File;Ljava/io/File;)V
    .locals 11

    const/4 v8, -0x1

    const/4 v9, -0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lnet/youmi/android/a/b/g/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/io/File;Ljava/io/File;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/io/File;Ljava/io/File;II)V
    .locals 7

    const/4 v6, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->a:I

    const/16 v0, 0xa

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->b:I

    iput-boolean v6, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    iput v6, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    iput v6, p0, Lnet/youmi/android/a/b/g/a/c;->h:I

    iput v6, p0, Lnet/youmi/android/a/b/g/a/c;->i:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->j:Landroid/content/Context;

    iput-object p6, p0, Lnet/youmi/android/a/b/g/a/c;->c:Ljava/io/File;

    iput-object p5, p0, Lnet/youmi/android/a/b/g/a/c;->d:Ljava/io/File;

    new-instance v0, Lnet/youmi/android/a/b/g/a/a;

    iget-object v1, p0, Lnet/youmi/android/a/b/g/a/c;->j:Landroid/content/Context;

    iget-object v3, p0, Lnet/youmi/android/a/b/g/a/c;->d:Ljava/io/File;

    move-object v2, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/a/b/g/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;J)V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->g:Lnet/youmi/android/a/b/g/a/a;

    if-lez p7, :cond_0

    iput p7, p0, Lnet/youmi/android/a/b/g/a/c;->a:I

    :cond_0
    if-lez p8, :cond_1

    iput p8, p0, Lnet/youmi/android/a/b/g/a/c;->b:I

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    iput v6, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    return-void
.end method

.method private h()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->g:Lnet/youmi/android/a/b/g/a/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/a;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->d:Ljava/io/File;

    iget-object v1, p0, Lnet/youmi/android/a/b/g/a/c;->c:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    const/4 v0, 0x1

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    const/4 v0, 0x3

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    const/4 v0, 0x2

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    return v0
.end method

.method public b()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 2

    iget v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->g:Lnet/youmi/android/a/b/g/a/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/a;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->g:Lnet/youmi/android/a/b/g/a/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/a;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->g:Lnet/youmi/android/a/b/g/a/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/a/a;->c()I

    move-result v0

    return v0
.end method

.method public run()V
    .locals 2

    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->j:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lnet/youmi/android/a/b/g/a/c;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->i:I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v0, 0x2710

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    :cond_1
    :goto_0
    :try_start_3
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/c;->j:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lnet/youmi/android/a/b/g/a/c;->i:I

    iget v1, p0, Lnet/youmi/android/a/b/g/a/c;->b:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    const/4 v0, 0x3

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    :cond_2
    :goto_1
    return-void

    :catch_0
    move-exception v0

    :cond_3
    :try_start_4
    iget v0, p0, Lnet/youmi/android/a/b/g/a/c;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->h:I

    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/c;->h()V

    iget v0, p0, Lnet/youmi/android/a/b/g/a/c;->h:I

    iget v1, p0, Lnet/youmi/android/a/b/g/a/c;->a:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/a/c;->e:Z

    const/4 v0, 0x3

    iput v0, p0, Lnet/youmi/android/a/b/g/a/c;->f:I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_0
.end method
