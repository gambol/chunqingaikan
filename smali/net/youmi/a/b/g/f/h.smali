.class public Lnet/youmi/android/a/b/g/f/h;
.super Lnet/youmi/android/a/b/g/f/a;


# instance fields
.field private d:J

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x6a

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/f/a;-><init>(I)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/youmi/android/a/b/g/f/h;->d:J

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/b/g/f/h;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/f/h;->f:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 16

    invoke-super/range {p0 .. p4}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->d()Ljava/io/File;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->c()Ljava/io/File;

    move-result-object v12

    :goto_0
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lnet/youmi/android/a/b/g/f/h;->f:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v3, :cond_0

    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->g()Lnet/youmi/android/a/b/g/a/c;

    move-result-object v3

    if-nez v3, :cond_1

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lnet/youmi/android/a/b/g/f/h;->f:Z

    const/16 v3, 0x68

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/a/c;->a()Z

    move-result v4

    if-nez v4, :cond_5

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Lnet/youmi/android/a/b/g/f/h;->f:Z

    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/a/c;->b()Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v3, 0x67

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    :cond_2
    :goto_2
    const-wide/16 v4, 0x5dc

    :try_start_2
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v3

    goto :goto_0

    :cond_3
    :try_start_3
    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/a/c;->c()Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v3, 0x6b

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/a/c;->d()Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x68

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :cond_5
    if-eqz v12, :cond_6

    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x69

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :cond_6
    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->b()Z

    move-result v3

    if-nez v3, :cond_7

    const/16 v3, 0x64

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto :goto_1

    :cond_7
    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->e()Lnet/youmi/android/a/b/g/e/a;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v8

    const-wide/16 v4, 0x0

    cmp-long v3, v8, v4

    if-gtz v3, :cond_8

    move-object/from16 v0, p0

    iget v3, v0, Lnet/youmi/android/a/b/g/f/h;->e:I

    const/4 v4, 0x3

    if-ge v3, v4, :cond_8

    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->e()Lnet/youmi/android/a/b/g/e/a;

    move-result-object v3

    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lnet/youmi/android/a/b/i/i;->a(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->e()Lnet/youmi/android/a/b/g/e/a;

    move-result-object v3

    invoke-virtual {v3, v8, v9}, Lnet/youmi/android/a/b/g/e/a;->a(J)V

    move-object/from16 v0, p0

    iget v3, v0, Lnet/youmi/android/a/b/g/f/h;->e:I

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    iput v3, v0, Lnet/youmi/android/a/b/g/f/h;->e:I

    :cond_8
    if-nez v2, :cond_9

    const/16 v3, 0x64

    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/b/g/a/d;->a(I)V

    goto/16 :goto_1

    :cond_9
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v10

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    cmp-long v3, v8, v6

    if-lez v3, :cond_a

    const-wide/16 v4, 0x64

    mul-long/2addr v4, v10

    div-long/2addr v4, v8

    long-to-int v5, v4

    :cond_a
    move-object/from16 v0, p0

    iget-wide v6, v0, Lnet/youmi/android/a/b/g/f/h;->d:J

    sub-long v6, v10, v6

    const-wide/16 v14, 0x3e8

    mul-long/2addr v6, v14

    const-wide/16 v14, 0x5dc

    div-long/2addr v6, v14

    move-object/from16 v0, p0

    iput-wide v10, v0, Lnet/youmi/android/a/b/g/f/h;->d:J

    move-object/from16 v3, p4

    move-object/from16 v4, p3

    invoke-interface/range {v3 .. v11}, Lnet/youmi/android/a/b/g/d/e;->a(Lnet/youmi/android/a/b/g/e/a;IJJJ)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_2

    :catch_2
    move-exception v2

    goto/16 :goto_1
.end method
