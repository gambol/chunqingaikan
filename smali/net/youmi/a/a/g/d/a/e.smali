.class Lnet/youmi/android/a/a/g/d/a/e;
.super Ljava/lang/Object;


# static fields
.field private static d:Lnet/youmi/android/a/a/g/d/a/e;


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->a:I

    iput-boolean v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->c:Z

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    return-void
.end method

.method static a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/e;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/g/d/a/e;->d:Lnet/youmi/android/a/a/g/d/a/e;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/e;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/d/a/e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/d/a/e;->d:Lnet/youmi/android/a/a/g/d/a/e;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/d/a/e;->d:Lnet/youmi/android/a/a/g/d/a/e;

    return-object v0
.end method

.method private a(Ljava/lang/String;I)V
    .locals 0

    sparse-switch p2, :sswitch_data_0

    :goto_0
    return-void

    :sswitch_0
    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/a/g/d/a/e;->c(Ljava/lang/String;I)V

    goto :goto_0

    :sswitch_1
    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/a/g/d/a/e;->b(Ljava/lang/String;I)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x4 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method private b(Ljava/lang/String;I)V
    .locals 3

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v1, p1}, Lnet/youmi/android/a/a/g/a/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p2, v2}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private c(Ljava/lang/String;I)V
    .locals 4

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v0

    invoke-static {p1}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v2}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    sparse-switch p2, :sswitch_data_0

    :goto_0
    invoke-virtual {v0, v2}, Lnet/youmi/android/a/a/g/a/a/a;->b(Lnet/youmi/android/a/a/g/a/b/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p2, v2}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    :cond_0
    :goto_1
    return-void

    :sswitch_0
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :sswitch_1
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0xd -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method a()V
    .locals 11

    const/4 v1, 0x1

    const/4 v10, 0x0

    const-wide/16 v2, 0x0

    iget-boolean v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->c:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v1, p0, Lnet/youmi/android/a/a/g/d/a/e;->c:Z

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/b;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/d/a/d;

    iget-object v4, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v4}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v4

    invoke-virtual {v4, v0}, Lnet/youmi/android/a/a/g/d/a/a;->a(Lnet/youmi/android/a/a/g/d/a/d;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    :cond_1
    :goto_2
    iput-boolean v10, p0, Lnet/youmi/android/a/a/g/d/a/e;->c:Z

    goto :goto_0

    :cond_2
    :goto_3
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/a;->c()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->c:Z

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/a;->b()Lnet/youmi/android/a/a/g/d/a/d;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-wide v0, v4, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    iget-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    cmp-long v5, v6, v2

    if-lez v5, :cond_3

    iget-object v5, v4, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    invoke-static {v5}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/b;

    move-result-object v0

    iget-object v1, v4, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/d/a/d;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/d;->a()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-wide v6, v0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    cmp-long v1, v6, v2

    if-lez v1, :cond_7

    iget-wide v6, v0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iget-wide v8, v4, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    cmp-long v1, v6, v8

    if-gez v1, :cond_6

    iget-wide v0, v0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iget-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    add-long/2addr v0, v6

    iget-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    cmp-long v5, v6, v0

    if-gez v5, :cond_5

    iget-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->a:J
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    sub-long/2addr v0, v6

    :cond_3
    :goto_4
    cmp-long v5, v0, v2

    if-lez v5, :cond_4

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :cond_4
    :goto_5
    :try_start_3
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    iget-object v1, v4, Lnet/youmi/android/a/a/g/d/a/d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lnet/youmi/android/a/a/g/d/a/e;->a:I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_9

    const-wide/16 v0, 0x1388

    :try_start_4
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :cond_5
    move-wide v0, v2

    goto :goto_4

    :cond_6
    :try_start_5
    iget-wide v0, v0, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iget-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->a:J

    sub-long/2addr v0, v6

    iget-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    add-long/2addr v0, v6

    goto :goto_4

    :cond_7
    move-wide v0, v2

    goto :goto_4

    :cond_8
    iget-wide v0, v4, Lnet/youmi/android/a/a/g/d/a/d;->g:J

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/a/g/d/a/e;->a:I

    goto/16 :goto_2

    :cond_a
    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/d/a/a;->a()Lnet/youmi/android/a/a/g/d/a/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v4, Lnet/youmi/android/a/a/g/d/a/d;->e:J

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/e;->b:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lnet/youmi/android/a/a/g/d/a/b;->b(Lnet/youmi/android/a/a/g/d/a/d;)Z

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "c"

    const/4 v5, -0x1

    invoke-static {v0, v1, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v4, Lnet/youmi/android/a/a/g/d/a/d;->h:Ljava/lang/String;

    iget v1, v4, Lnet/youmi/android/a/a/g/d/a/d;->c:I

    invoke-direct {p0, v0, v1}, Lnet/youmi/android/a/a/g/d/a/e;->a(Ljava/lang/String;I)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_3

    :catch_2
    move-exception v0

    goto :goto_5
.end method
