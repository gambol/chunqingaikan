.class public Lnet/youmi/android/a/a/g/c/i;
.super Lnet/youmi/android/a/a/g/f/a/a;


# static fields
.field private static c:I


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lnet/youmi/android/a/a/g/c/i;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/f/a/a;-><init>()V

    sget v0, Lnet/youmi/android/a/a/g/c/i;->c:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lnet/youmi/android/a/a/g/c/i;->c:I

    iput v0, p0, Lnet/youmi/android/a/a/g/c/i;->d:I

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lnet/youmi/android/a/a/g/c/i;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 2

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->E()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/a/g/c/i;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xbb8

    invoke-direct {p0, p1, v0}, Lnet/youmi/android/a/a/g/c/i;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 6

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/a/b/k/f;->b()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v0, v2

    double-to-int v0, v0

    :goto_1
    :try_start_2
    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/g/c/j;

    invoke-direct {v2, p0, p1, v0}, Lnet/youmi/android/a/a/g/c/j;-><init>(Lnet/youmi/android/a/a/g/c/i;Ljava/lang/String;I)V

    int-to-long v4, p2

    invoke-virtual {v1, v2, v4, v5}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/a/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/a/b/d;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    invoke-static {}, Lnet/youmi/android/a/a/g/c/l;->b()Lnet/youmi/android/a/a/g/c/l;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lnet/youmi/android/a/a/a/b/d;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/a/a/b/b;)Lnet/youmi/android/a/a/a/b/a;

    move-result-object v10

    if-nez v10, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ydic"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/c/i;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    const/4 v1, 0x0

    const/4 v0, 0x1

    :try_start_1
    iget-object v3, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v3}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v3

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    if-nez v3, :cond_b

    const/4 v2, 0x0

    :cond_3
    :goto_1
    move v8, v1

    move v9, v2

    :goto_2
    :try_start_2
    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->j()Lnet/youmi/android/a/a/e/g/b;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-virtual {v11}, Lnet/youmi/android/a/a/e/g/b;->e()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    const/4 v4, 0x3

    invoke-static {v1, v11, v4}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)Ljava/lang/String;

    move-result-object v4

    const-wide/32 v6, 0x1499700

    add-long/2addr v6, v2

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/d;

    const/4 v5, 0x3

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/a/g/d/a/d;-><init>(JLjava/lang/String;IJ)V

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->d()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    new-instance v2, Lnet/youmi/android/a/a/g/d/a/f;

    iget-object v3, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-direct {v2, v3, v1}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/d/a/d;)V

    invoke-static {v2}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    if-eqz v9, :cond_4

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11}, Lnet/youmi/android/a/a/e/g/b;->f()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide/32 v6, 0x1499700

    invoke-static {v2, v3, v5, v6, v7}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    if-nez v8, :cond_4

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->b()J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v2, v2, v6

    if-lez v2, :cond_4

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lnet/youmi/android/a/c/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/32 v4, 0x1499700

    invoke-static {v2, v3, v1, v4, v5}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    :try_start_3
    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v1, Ljava/io/File;

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    :goto_3
    :try_start_4
    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/youmi/android/a/b/k/h;->c(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :goto_4
    :try_start_5
    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    if-eqz v0, :cond_7

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/c/i;->a(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_7
    :goto_5
    :try_start_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v1, 0x0

    :try_start_7
    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->i()Lnet/youmi/android/a/a/a/b/c;

    move-result-object v0

    if-eqz v0, :cond_e

    instance-of v2, v0, Lnet/youmi/android/a/a/g/c/k;

    if-eqz v2, :cond_e

    check-cast v0, Lnet/youmi/android/a/a/g/c/k;
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_6
    move-object v1, v0

    :goto_7
    const/4 v0, 0x0

    if-eqz v1, :cond_8

    :try_start_8
    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/c/k;->b()I

    move-result v0

    :cond_8
    invoke-static {}, Lnet/youmi/android/AdManager;->isInstallationSuccessTipsDisplayOnNotification()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    iget-object v3, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lnet/youmi/android/a/a/g/c/d;->a(Landroid/content/Context;ILjava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_8
    :try_start_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const/4 v0, 0x0

    if-eqz v1, :cond_9

    :try_start_a
    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/c/k;->c()I

    move-result v0

    :cond_9
    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/c/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/c/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/g/c/a;->a(I)V

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/c/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/c/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/g/c/a;->b(I)V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_9
    :try_start_b
    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->h()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    const/high16 v2, 0x10000000

    invoke-static {v1, v0, v2}, Lnet/youmi/android/a/b/k/h;->a(Landroid/content/Context;Ljava/lang/String;I)Z

    :goto_a
    if-eqz v9, :cond_a

    if-nez v8, :cond_a

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_a

    new-instance v0, Lnet/youmi/android/a/a/g/a/b/b;

    invoke-direct {v0}, Lnet/youmi/android/a/a/g/a/b/b;-><init>()V

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/a/b/b;->b(Ljava/lang/String;)V

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/a/b/b;->a(Ljava/lang/String;)V

    invoke-virtual {v10}, Lnet/youmi/android/a/a/a/b/a;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lnet/youmi/android/a/a/g/a/b/b;->c(J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lnet/youmi/android/a/a/g/a/b/b;->a(J)V

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lnet/youmi/android/a/a/g/a/g;->a(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;)V
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :cond_a
    :goto_b
    :try_start_c
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/a/b/d;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/a/b/d;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/a/b/d;->a(Ljava/lang/String;)Z
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_b
    :try_start_d
    invoke-virtual {v3}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/g/a/b/a;->e()I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    const/4 v1, 0x1

    const/4 v0, 0x0

    goto/16 :goto_1

    :catch_1
    move-exception v3

    move v8, v1

    move v9, v2

    goto/16 :goto_2

    :cond_c
    :try_start_e
    invoke-static {p1}, Lnet/youmi/android/a/b/k/o;->a(Landroid/content/Context;)Landroid/app/NotificationManager;
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result-object v2

    :try_start_f
    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_f
    .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto/16 :goto_8

    :catch_2
    move-exception v0

    goto/16 :goto_8

    :cond_d
    :try_start_10
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/i;->b:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/i;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/b/k/h;->b(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_10
    .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    goto :goto_a

    :catch_3
    move-exception v0

    goto :goto_b

    :catchall_0
    move-exception v0

    throw v0

    :catch_4
    move-exception v0

    goto/16 :goto_0

    :catch_5
    move-exception v0

    goto/16 :goto_9

    :catch_6
    move-exception v0

    goto/16 :goto_8

    :catch_7
    move-exception v0

    goto/16 :goto_7

    :catch_8
    move-exception v0

    goto/16 :goto_5

    :catch_9
    move-exception v1

    goto/16 :goto_4

    :catch_a
    move-exception v1

    goto/16 :goto_3

    :cond_e
    move-object v0, v1

    goto/16 :goto_6
.end method
