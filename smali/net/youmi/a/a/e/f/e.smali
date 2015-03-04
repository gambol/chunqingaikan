.class public Lnet/youmi/android/a/a/e/f/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/ArrayList;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:Lorg/json/JSONArray;

.field private f:Ljava/lang/String;

.field private g:Lnet/youmi/android/a/a/e/a/b/h;

.field private h:Lnet/youmi/android/a/a/e/f/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/a/b/h;Ljava/util/ArrayList;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/f/e;->b:Ljava/util/ArrayList;

    iput-object p4, p0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    iput-wide p5, p0, Lnet/youmi/android/a/a/e/f/e;->d:J

    iput-object p7, p0, Lnet/youmi/android/a/a/e/f/e;->f:Ljava/lang/String;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/f/e;->g:Lnet/youmi/android/a/a/e/a/b/h;

    new-instance v0, Lnet/youmi/android/a/a/e/f/f;

    invoke-direct {v0, p0, p1}, Lnet/youmi/android/a/a/e/f/f;-><init>(Lnet/youmi/android/a/a/e/f/e;Landroid/content/Context;)V

    iput-object v0, p0, Lnet/youmi/android/a/a/e/f/e;->h:Lnet/youmi/android/a/a/e/f/f;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 23

    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_2

    :cond_0
    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "javascript:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-wide v6, v0, Lnet/youmi/android/a/a/e/f/e;->d:J

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lnet/youmi/android/a/a/e/f/e;->f:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_c

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 v2, 0x0

    move/from16 v17, v2

    :goto_1
    :try_start_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    move/from16 v0, v17

    if-ge v0, v2, :cond_7

    new-instance v18, Lorg/json/JSONObject;

    invoke-direct/range {v18 .. v18}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    if-nez v2, :cond_3

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->b:Ljava/util/ArrayList;

    move/from16 v0, v17

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    const-string v3, "packageName"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "apkUrl"

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "md5sum"

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v5, "a"

    move-object/from16 v0, v18

    invoke-virtual {v0, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v5, v0, Lnet/youmi/android/a/a/e/f/e;->h:Lnet/youmi/android/a/a/e/f/f;

    invoke-virtual {v5, v4, v2}, Lnet/youmi/android/a/a/e/f/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "b"

    const/4 v4, 0x1

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v2, 0x1

    move/from16 v16, v2

    :goto_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    invoke-static {v2, v3}, Lnet/youmi/android/a/b/k/j;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v20

    if-eqz v20, :cond_5

    const-string v2, "c"

    const/4 v3, 0x1

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v2, 0x1

    move v10, v2

    :goto_3
    const-string v7, ""

    const-string v6, ""

    const/4 v2, 0x0

    const-string v3, ""

    const-wide/16 v8, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v4, 0x0

    if-eqz v10, :cond_6

    move-object/from16 v0, v20

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v0, p0

    iget-object v6, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, v20

    iget-object v14, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    move-object/from16 v0, v20

    iget v11, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    move-object/from16 v0, v20

    iget-wide v6, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    move-object/from16 v0, v20

    iget-wide v12, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_b
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-wide v8, v6

    move-wide v6, v12

    :goto_4
    :try_start_5
    move-object/from16 v0, v20

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v0, p0

    iget-object v10, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    invoke-virtual {v2, v10}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v2

    :try_start_6
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v12, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v13, 0x64

    invoke-virtual {v2, v12, v13, v10}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {v2, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v10

    :goto_5
    if-eqz v16, :cond_b

    :try_start_7
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->length()J

    move-result-wide v2

    :goto_6
    move-wide v4, v6

    move-object v6, v10

    move v7, v11

    move-object v10, v14

    move-object v11, v15

    :goto_7
    const-string v12, "d"

    move-object/from16 v0, v18

    invoke-virtual {v0, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "e"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "f"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v6, "g"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "h"

    move-object/from16 v0, v18

    invoke-virtual {v0, v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "i"

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "j"

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v17, 0x1

    move/from16 v17, v2

    goto/16 :goto_1

    :cond_4
    const-string v2, "b"

    const/4 v4, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v2, 0x0

    move/from16 v16, v2

    goto/16 :goto_2

    :cond_5
    const-string v2, "c"

    const/4 v3, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v2, 0x0

    move v10, v2

    goto/16 :goto_3

    :catch_0
    move-exception v2

    move-wide v6, v8

    :goto_8
    move-wide v8, v6

    move-wide v6, v12

    goto/16 :goto_4

    :catch_1
    move-exception v2

    move-object v10, v3

    goto :goto_5

    :cond_6
    if-eqz v16, :cond_a

    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->length()J
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-wide v10

    :try_start_8
    move-object/from16 v0, p0

    iget-object v4, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const/4 v14, 0x1

    invoke-virtual {v4, v5, v14}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    if-eqz v4, :cond_9

    iget-object v14, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v0, p0

    iget-object v5, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, v14}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object v5, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    iget v4, v4, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v14}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result-object v2

    :try_start_b
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v14, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v15, 0x64

    invoke-virtual {v2, v14, v15, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v2, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-result-object v2

    move v3, v4

    move-object v4, v5

    move-object v5, v7

    :goto_9
    move-object v6, v2

    move v7, v3

    move-wide v2, v10

    move-object v10, v4

    move-object v11, v5

    move-wide v4, v12

    goto/16 :goto_7

    :catch_2
    move-exception v2

    move-object v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v7

    goto :goto_9

    :catch_3
    move-exception v4

    :goto_a
    move-wide v4, v12

    move-wide/from16 v21, v10

    move-object v10, v6

    move-object v11, v7

    move v7, v2

    move-object v6, v3

    move-wide/from16 v2, v21

    goto/16 :goto_7

    :catch_4
    move-exception v2

    :cond_7
    :try_start_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "javascript:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-wide v6, v0, Lnet/youmi/android/a/a/e/f/e;->d:J

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lnet/youmi/android/a/a/e/f/e;->f:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_5

    goto/16 :goto_0

    :catch_5
    move-exception v2

    goto/16 :goto_0

    :catch_6
    move-exception v2

    :try_start_d
    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "javascript:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v0, p0

    iget-wide v6, v0, Lnet/youmi/android/a/a/e/f/e;->d:J

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lnet/youmi/android/a/a/e/f/e;->f:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_7

    goto/16 :goto_0

    :catch_7
    move-exception v2

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    :try_start_e
    move-object/from16 v0, p0

    iget-object v3, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    if-eqz v3, :cond_8

    move-object/from16 v0, p0

    iget-object v3, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    if-eqz v3, :cond_8

    move-object/from16 v0, p0

    iget-object v3, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_8

    move-object/from16 v0, p0

    iget-object v3, v0, Lnet/youmi/android/a/a/e/f/e;->e:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "javascript:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lnet/youmi/android/a/a/e/f/e;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, p0

    iget-wide v6, v0, Lnet/youmi/android/a/a/e/f/e;->d:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ")"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v5, v0, Lnet/youmi/android/a/a/e/f/e;->f:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_8

    :cond_8
    :goto_b
    throw v2

    :catch_8
    move-exception v3

    goto :goto_b

    :catch_9
    move-exception v4

    move-object v6, v5

    goto/16 :goto_a

    :catch_a
    move-exception v2

    move v2, v4

    move-object v6, v5

    goto/16 :goto_a

    :catch_b
    move-exception v2

    goto/16 :goto_8

    :catch_c
    move-exception v2

    goto/16 :goto_0

    :cond_9
    move-object v4, v6

    move-object v5, v7

    move-object/from16 v21, v3

    move v3, v2

    move-object/from16 v2, v21

    goto/16 :goto_9

    :cond_a
    move-object v10, v6

    move-object v11, v7

    move-object v6, v3

    move v7, v2

    move-wide v2, v4

    move-wide v4, v12

    goto/16 :goto_7

    :cond_b
    move-wide v2, v4

    goto/16 :goto_6
.end method
