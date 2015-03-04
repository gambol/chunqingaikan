package com.tencent.open; class c { void a() { int a;
a=0;// .class public Lcom/tencent/open/c;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/open/c$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/util/HashMap",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Lcom/tencent/open/c$a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd-HHmmss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lcom/tencent/open/c;->a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/tencent/open/c$a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/tencent/open/c;);
a=0;//     iput-object p1, p0, Lcom/tencent/open/c;->b:Lcom/tencent/open/c$a;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 131
a=0;//     #v1=(Integer);
a=0;//     iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 132
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(One);
a=0;//     if-gt v1, p3, :cond_0
a=0;// 
a=0;//     if-le v2, p2, :cond_1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     int-to-float v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, p3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v2
a=0;// 
a=0;//     int-to-float v2, p2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 137
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Float);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 137
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v4, 0x140
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(One);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit16 v1, v1, 0x400
a=0;// 
a=0;//     const/16 v3, 0x400
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-le v1, v3, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->reset()V
a=0;// 
a=0;//     .line 101
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x32
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(PosShort);
a=0;//     new-instance v1, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-direct {v1, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 104
a=0;//     #v1=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     new-instance v3, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     #v3=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {v1, v6, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 108
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 115
a=0;//     invoke-direct {p0, v3, v4, v4}, Lcom/tencent/open/c;->a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 117
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "comp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "comp be="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 121
a=0;//     iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-static {v0, v6, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Integer);v4=(PosShort);v5=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(J)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     .line 215
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     sget-object v1, Lcom/tencent/open/c;->a:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 224
a=0;//     #v0=(One);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 225
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 228
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, "/mnt/sdcard-ext"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const-string v0, "."
a=0;// 
a=0;//     .line 201
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 202
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 203
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, "/mnt/sdcard-ext"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 206
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     const-string v0, "/mnt/sdcard-ext"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 161
a=0;//     #v1=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 163
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {p0, v2, v3}, Lcom/tencent/open/c;->a(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ".png"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {p0}, Lcom/tencent/open/c;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".AppCenterWebBuffer"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 179
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 181
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 188
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 190
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 196
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 185
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 186
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const-string v0, ""
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 188
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 190
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 191
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 190
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     .line 192
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     throw v0
a=0;// 
a=0;//     .line 191
a=0;//     :catch_2
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v3=(PosByte);v4=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 188
a=0;//     :catchall_1
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);v4=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 185
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Landroid/graphics/Bitmap;)Ljava/util/HashMap;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ")",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x140
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v4=(Null);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     aget-object v2, p1, v0
a=0;// 
a=0;//     .line 50
a=0;//     #v2=(Null);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 53
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-le v0, v3, :cond_2
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     invoke-direct {p0, v2}, Lcom/tencent/open/c;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 55
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-direct {p0, v3}, Lcom/tencent/open/c;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 62
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 65
a=0;//     const-string v2, "ResultType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 66
a=0;//     const-string v2, "ResultValue"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 59
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Null);v3=(PosShort);
a=0;//     invoke-direct {p0, v2}, Lcom/tencent/open/c;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "ResultType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 70
a=0;//     const-string v2, "ResultValue"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/util/HashMap;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const-string v0, "ResultType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v1, p0, Lcom/tencent/open/c;->b:Lcom/tencent/open/c$a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/c$a;);
a=0;//     const-string v0, "ResultValue"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/open/c$a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     :goto_0
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v1, p0, Lcom/tencent/open/c;->b:Lcom/tencent/open/c$a;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/c$a;);
a=0;//     const-string v0, "ResultValue"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/open/c$a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     check-cast p1, [Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/open/c;->a([Landroid/graphics/Bitmap;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     check-cast p1, Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/tencent/open/c;->a(Ljava/util/HashMap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
