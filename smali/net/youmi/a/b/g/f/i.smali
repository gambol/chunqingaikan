.class public Lnet/youmi/android/a/b/g/f/i;
.super Lnet/youmi/android/a/b/g/f/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x69

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/g/f/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V
    .locals 14

    invoke-super/range {p0 .. p4}, Lnet/youmi/android/a/b/g/f/a;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/a/d;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/e;)V

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->c()Ljava/io/File;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lnet/youmi/android/a/b/g/a/d;->f()Lnet/youmi/android/a/b/g/d/b;

    move-result-object v4

    if-nez v4, :cond_0

    move-object/from16 v0, p4

    move-object/from16 v1, p3

    invoke-interface {v0, v1}, Lnet/youmi/android/a/b/g/d/e;->d(Lnet/youmi/android/a/b/g/e/a;)V

    :goto_0
    return-void

    :cond_0
    const/4 v2, 0x1

    move-object/from16 v0, p3

    invoke-interface {v4, v0}, Lnet/youmi/android/a/b/g/d/b;->g_(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-virtual/range {p3 .. p3}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lnet/youmi/android/a/b/i/i;->a(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    invoke-virtual/range {p3 .. p3}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v5, v10, v12

    if-gtz v5, :cond_1

    move-object/from16 v0, p3

    invoke-virtual {v0, v8, v9}, Lnet/youmi/android/a/b/g/e/a;->a(J)V

    :cond_1
    cmp-long v5, v6, v8

    if-eqz v5, :cond_2

    const/4 v2, 0x0

    :cond_2
    if-eqz v2, :cond_3

    move-object/from16 v0, p3

    invoke-interface {v4, v0}, Lnet/youmi/android/a/b/g/d/b;->i(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v4

    if-nez v4, :cond_3

    const/4 v2, 0x0

    :cond_3
    if-eqz v2, :cond_4

    move-object/from16 v0, p4

    move-object/from16 v1, p3

    invoke-interface {v0, v1}, Lnet/youmi/android/a/b/g/d/e;->d(Lnet/youmi/android/a/b/g/e/a;)V

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    const/16 v2, 0x64

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/g/a/d;->a(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method
