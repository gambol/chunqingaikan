.class public Lnet/youmi/android/a/a/g/d/a/h;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/a/e/g/b;

.field private c:[I

.field private d:[J

.field private e:[Ljava/lang/String;

.field private f:[J

.field private g:Lnet/youmi/android/a/a/g/d/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;[I[J[Ljava/lang/String;[J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/d/a/h;->b:Lnet/youmi/android/a/a/e/g/b;

    iput-object p3, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    iput-object p4, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    iput-object p5, p0, Lnet/youmi/android/a/a/g/d/a/h;->e:[Ljava/lang/String;

    iput-object p6, p0, Lnet/youmi/android/a/a/g/d/a/h;->f:[J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/d/a/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/d/a/h;->g:Lnet/youmi/android/a/a/g/d/a/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->g:Lnet/youmi/android/a/a/g/d/a/d;

    if-eqz v1, :cond_3

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/h;->g:Lnet/youmi/android/a/a/g/d/a/d;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/d;->a()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/b;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->g:Lnet/youmi/android/a/a/g/d/a/d;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Lnet/youmi/android/a/a/g/d/a/d;)Z

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->g:Lnet/youmi/android/a/a/g/d/a/d;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/d/a/a;->a(Lnet/youmi/android/a/a/g/d/a/d;)Z

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a/e;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/d/a/e;->a()V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    if-eqz v1, :cond_4

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    array-length v1, v1

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    array-length v2, v2

    if-eq v1, v2, :cond_5

    :cond_4
    const/4 v1, 0x0

    iput-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    array-length v1, v1

    new-array v1, v1, [J

    iput-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    move v1, v0

    :goto_1
    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    array-length v2, v2

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    const-wide/32 v4, 0x1499700

    aput-wide v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->c:[I

    aget v5, v1, v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->d:[J

    aget-wide v6, v1, v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->b:Lnet/youmi/android/a/a/e/g/b;

    invoke-static {v1, v2, v5}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    :cond_6
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v6, v2

    new-instance v1, Lnet/youmi/android/a/a/g/d/a/d;

    invoke-direct/range {v1 .. v7}, Lnet/youmi/android/a/a/g/d/a/d;-><init>(JLjava/lang/String;IJ)V

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/d/a/d;->a()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_6

    :try_start_1
    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->e:[Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->e:[Ljava/lang/String;

    aget-object v2, v2, v0

    iput-object v2, v1, Lnet/youmi/android/a/a/g/d/a/d;->f:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    :cond_8
    :goto_4
    :try_start_2
    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->f:[J

    if-eqz v2, :cond_9

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->f:[J

    aget-wide v2, v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_9

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->f:[J

    aget-wide v2, v2, v0

    iput-wide v2, v1, Lnet/youmi/android/a/a/g/d/a/d;->g:J
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :cond_9
    :goto_5
    :try_start_3
    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/a/g/d/a/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/a/g/d/a/b;->a(Lnet/youmi/android/a/a/g/d/a/d;)Z

    iget-object v2, p0, Lnet/youmi/android/a/a/g/d/a/h;->a:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/a/g/d/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnet/youmi/android/a/a/g/d/a/a;->a(Lnet/youmi/android/a/a/g/d/a/d;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :catch_1
    move-exception v2

    goto :goto_5

    :catch_2
    move-exception v2

    goto :goto_4
.end method
