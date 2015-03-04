.class public Lnet/youmi/android/a/a/g/a/c;
.super Ljava/lang/Object;


# static fields
.field public static a:I

.field private static b:I

.field private static c:I


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4e20

    sput v0, Lnet/youmi/android/a/a/g/a/c;->b:I

    const/16 v0, 0x4e21

    sput v0, Lnet/youmi/android/a/a/g/a/c;->c:I

    const/4 v0, -0x1

    sput v0, Lnet/youmi/android/a/a/g/a/c;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/a/a/g/a/c;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    return-object v0
.end method

.method private a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/b;I)Lnet/youmi/android/a/a/g/d/a/d;
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0, p2, p3}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)Ljava/lang/String;

    move-result-object v4

    const-wide/32 v0, 0x1499700

    add-long v6, v2, v0

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/d;

    move v5, p3

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/a/g/d/a/d;-><init>(JLjava/lang/String;IJ)V

    iput-object p1, v1, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    return-object v1
.end method

.method private a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/b;ILjava/lang/String;J)Lnet/youmi/android/a/a/g/d/a/d;
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/b;I)Lnet/youmi/android/a/a/g/d/a/d;

    move-result-object v0

    iput-object p4, v0, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    iput-wide p5, v0, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    const-string v0, ""

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v1

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->C()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/a/c;->b(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->f()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->C()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->B()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method private a(Ljava/lang/String;J)V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/a;->b()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :cond_0
    move v6, v0

    :goto_0
    if-gtz v6, :cond_1

    :goto_1
    return-void

    :catch_0
    move-exception v1

    move v6, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "a_wall"

    new-instance v0, Lnet/youmi/android/a/c/c/b;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lnet/youmi/android/b/k;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/b/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lnet/youmi/android/b/b;->b()Lnet/youmi/android/b/a;

    move-result-object v1

    const-string v2, "unexp"

    invoke-virtual {v1, v2}, Lnet/youmi/android/b/a;->a(Ljava/lang/String;)Lnet/youmi/android/b/a;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/youmi/android/b/a;->b(Ljava/lang/String;)Lnet/youmi/android/b/a;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Lnet/youmi/android/b/a;->a(J)Lnet/youmi/android/b/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/b/k;->b(Lnet/youmi/android/b/b;)Z

    goto :goto_1
.end method

.method private b()I
    .locals 12

    const/4 v11, 0x0

    const/4 v10, 0x1

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->c()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget v0, Lnet/youmi/android/a/a/g/a/c;->b:I

    :goto_0
    return v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lnet/youmi/android/a/a/g/a/c;->b:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/g/a/a/c;->b(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/b;

    move-result-object v1

    if-nez v1, :cond_5

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->d()Lnet/youmi/android/a/a/g/a/b/b;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->d()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnet/youmi/android/a/a/g/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v11}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v2, v3}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;J)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a()V

    sget v0, Lnet/youmi/android/a/a/g/a/c;->c:I

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->g()I

    move-result v1

    if-ne v1, v10, :cond_4

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->d()V

    :goto_2
    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/a/g/a/a/c;->c(Lnet/youmi/android/a/a/g/a/b/b;)Z

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->c()V

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->f()I

    move-result v3

    if-nez v3, :cond_9

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->d()Lnet/youmi/android/a/a/g/a/b/b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->d()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v4, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/youmi/android/a/a/g/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v11}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v2, v3}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;J)V

    :cond_6
    :goto_3
    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a()V

    invoke-virtual {v1, v10}, Lnet/youmi/android/a/a/g/a/b/b;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lnet/youmi/android/a/a/g/a/b/b;->b(J)V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/a/a/c;->b(Lnet/youmi/android/a/a/g/a/b/b;)Z

    sget v0, Lnet/youmi/android/a/a/g/a/c;->c:I

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/b;->g()I

    move-result v2

    if-ne v2, v10, :cond_8

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->d()V

    :goto_4
    iget-object v2, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/a/g/a/a/c;->c(Lnet/youmi/android/a/a/g/a/b/b;)Z

    goto :goto_3

    :cond_8
    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->c()V

    goto :goto_4

    :cond_9
    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->f()I

    move-result v3

    if-ne v3, v10, :cond_e

    iget-object v3, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v11}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b

    iget-object v2, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Ljava/lang/String;)Z

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->g()I

    move-result v0

    if-ne v0, v10, :cond_a

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->d()V

    :goto_5
    sget v0, Lnet/youmi/android/a/a/g/a/c;->c:I

    goto/16 :goto_0

    :cond_a
    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->c()V

    goto :goto_5

    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->d()J

    move-result-wide v8

    sub-long/2addr v6, v8

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->e()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-ltz v3, :cond_c

    iget-object v3, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v3}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v3

    invoke-virtual {v3, v1}, Lnet/youmi/android/a/a/g/a/a/c;->c(Lnet/youmi/android/a/a/g/a/b/b;)Z

    new-instance v3, Lnet/youmi/android/a/a/e/g/b;

    invoke-direct {v3}, Lnet/youmi/android/a/a/e/g/b;-><init>()V

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/a/e/g/b;->e(Ljava/lang/String;)V

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->g()I

    move-result v4

    if-ne v4, v10, :cond_d

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/f;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    const/4 v4, 0x4

    invoke-direct {p0, v2, v3, v4}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/b;I)Lnet/youmi/android/a/a/g/d/a/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/d/a/d;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    :cond_c
    :goto_6
    sget v0, Lnet/youmi/android/a/a/g/a/c;->c:I

    goto/16 :goto_0

    :cond_d
    iget-object v4, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v11}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lnet/youmi/android/a/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/f;

    iget-object v8, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    const/16 v4, 0xd

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->e()J

    move-result-wide v6

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/a/g/a/c;->a(Ljava/lang/String;Lnet/youmi/android/a/a/e/g/b;ILjava/lang/String;J)Lnet/youmi/android/a/a/g/d/a/d;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Lnet/youmi/android/a/a/g/d/a/f;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/d/a/d;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V

    goto :goto_6

    :cond_e
    sget v0, Lnet/youmi/android/a/a/g/a/c;->c:I

    goto/16 :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/a/a/g/a/d;

    invoke-direct {v1, p0, p1}, Lnet/youmi/android/a/a/g/a/d;-><init>(Lnet/youmi/android/a/a/g/a/c;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private c()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->D()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/a/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method private d()V
    .locals 1

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->F()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/a/g/a/c;->b(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget v0, Lnet/youmi/android/a/a/g/a/c;->b:I

    invoke-direct {p0}, Lnet/youmi/android/a/a/g/a/c;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/g;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
