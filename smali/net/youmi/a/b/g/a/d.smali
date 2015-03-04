.class public Lnet/youmi/android/a/b/g/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/a/b/g/e/a;

.field private b:Lnet/youmi/android/a/b/g/d/e;

.field private c:Lnet/youmi/android/a/b/g/a/c;

.field private d:Lnet/youmi/android/a/b/g/d/b;

.field private e:Lnet/youmi/android/a/b/g/f/a;

.field private f:Lnet/youmi/android/a/b/g/f/g;

.field private g:Lnet/youmi/android/a/b/g/f/i;

.field private h:Lnet/youmi/android/a/b/g/f/c;

.field private i:Lnet/youmi/android/a/b/g/f/f;

.field private j:Lnet/youmi/android/a/b/g/f/e;

.field private k:Lnet/youmi/android/a/b/g/f/b;

.field private l:Lnet/youmi/android/a/b/g/f/d;

.field private m:Lnet/youmi/android/a/b/g/f/h;

.field private n:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 8

    const-wide/16 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->n:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/a/d;->a(Ljava/io/File;)V

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".ymtf"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/g/e/a;->b(Ljava/io/File;)V

    iput-object p3, p0, Lnet/youmi/android/a/b/g/a/d;->d:Lnet/youmi/android/a/b/g/d/b;

    iput-object p4, p0, Lnet/youmi/android/a/b/g/a/d;->b:Lnet/youmi/android/a/b/g/d/e;

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    :cond_0
    new-instance v1, Lnet/youmi/android/a/b/g/a/c;

    iget-object v2, p0, Lnet/youmi/android/a/b/g/a/d;->n:Landroid/content/Context;

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v6

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/b/g/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/io/File;Ljava/io/File;)V

    iput-object v1, p0, Lnet/youmi/android/a/b/g/a/d;->c:Lnet/youmi/android/a/b/g/a/c;

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private declared-synchronized h()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->f:Lnet/youmi/android/a/b/g/f/g;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/g;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/g;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->f:Lnet/youmi/android/a/b/g/f/g;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->f:Lnet/youmi/android/a/b/g/f/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized i()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->h:Lnet/youmi/android/a/b/g/f/c;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/c;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/c;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->h:Lnet/youmi/android/a/b/g/f/c;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->h:Lnet/youmi/android/a/b/g/f/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized j()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->i:Lnet/youmi/android/a/b/g/f/f;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/f;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/f;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->i:Lnet/youmi/android/a/b/g/f/f;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->i:Lnet/youmi/android/a/b/g/f/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized k()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->j:Lnet/youmi/android/a/b/g/f/e;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/e;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/e;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->j:Lnet/youmi/android/a/b/g/f/e;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->j:Lnet/youmi/android/a/b/g/f/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized l()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->k:Lnet/youmi/android/a/b/g/f/b;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/b;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/b;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->k:Lnet/youmi/android/a/b/g/f/b;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->k:Lnet/youmi/android/a/b/g/f/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized m()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->l:Lnet/youmi/android/a/b/g/f/d;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/d;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/d;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->l:Lnet/youmi/android/a/b/g/f/d;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->l:Lnet/youmi/android/a/b/g/f/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized n()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->g:Lnet/youmi/android/a/b/g/f/i;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/i;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/i;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->g:Lnet/youmi/android/a/b/g/f/i;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->g:Lnet/youmi/android/a/b/g/f/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized o()Lnet/youmi/android/a/b/g/f/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->m:Lnet/youmi/android/a/b/g/f/h;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/f/h;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/f/h;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->m:Lnet/youmi/android/a/b/g/f/h;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->m:Lnet/youmi/android/a/b/g/f/h;
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
.method public a(I)V
    .locals 4

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->e:Lnet/youmi/android/a/b/g/f/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->e:Lnet/youmi/android/a/b/g/f/a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lnet/youmi/android/a/b/g/a/d;->e:Lnet/youmi/android/a/b/g/f/a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->e:Lnet/youmi/android/a/b/g/f/a;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->e:Lnet/youmi/android/a/b/g/f/a;

    iget-object v1, p0, Lnet/youmi/android/a/b/g/a/d;->n:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    iget-object v3, p0, Lnet/youmi/android/a/b/g/a/d;->b:Lnet/youmi/android/a/b/g/d/e;

    invoke-virtual {v0, v1, p0, v2, v3}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    :cond_1
    return-void

    :pswitch_0
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->h()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->i()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->j()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->k()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->l()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_5
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->m()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->n()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_7
    invoke-direct {p0}, Lnet/youmi/android/a/b/g/a/d;->o()Lnet/youmi/android/a/b/g/f/a;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_7
        :pswitch_5
    .end packed-switch
.end method

.method public a()Z
    .locals 8

    const-wide/16 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->c:Lnet/youmi/android/a/b/g/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->c:Lnet/youmi/android/a/b/g/a/c;

    invoke-static {v0}, Lnet/youmi/android/a/b/g/a/b;->a(Ljava/lang/Runnable;)V

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    :cond_1
    new-instance v1, Lnet/youmi/android/a/b/g/a/c;

    iget-object v2, p0, Lnet/youmi/android/a/b/g/a/d;->n:Landroid/content/Context;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v6

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/b/g/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/io/File;Ljava/io/File;)V

    iput-object v1, p0, Lnet/youmi/android/a/b/g/a/d;->c:Lnet/youmi/android/a/b/g/a/c;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->c:Lnet/youmi/android/a/b/g/a/c;

    invoke-static {v0}, Lnet/youmi/android/a/b/g/a/b;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b()Z
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/a/d;->d()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/a/d;->d()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/a/d;->d()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e80

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->h()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public e()Lnet/youmi/android/a/b/g/e/a;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    return-object v0
.end method

.method public f()Lnet/youmi/android/a/b/g/d/b;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->d:Lnet/youmi/android/a/b/g/d/b;

    return-object v0
.end method

.method public g()Lnet/youmi/android/a/b/g/a/c;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->c:Lnet/youmi/android/a/b/g/a/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/a/d;->a:Lnet/youmi/android/a/b/g/e/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/e/a;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public run()V
    .locals 1

    const/16 v0, 0x64

    :try_start_0
    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/g/a/d;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
