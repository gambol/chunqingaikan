package cn.waps.a; class o { void a() { int a;
a=0;// .class public Lcn/waps/a/o;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/o;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     int-to-float v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v0, v1, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance p2, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #p2=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {p2}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #p2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Ljava/lang/String;IIZ)Landroid/graphics/Bitmap;
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-wide/high16 v10, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     invoke-static {v0}, Ljunit/framework/Assert;->assertTrue(Z)V
a=0;// 
a=0;//     new-instance v9, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v9}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, v9, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     invoke-static {p0, v9}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "extractThumbNail: round="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "x"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", crop="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iget v0, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v3, v0
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     mul-double/2addr v3, v10
a=0;// 
a=0;//     int-to-double v5, p1
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     div-double v7, v3, v5
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     iget v0, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     int-to-double v3, v0
a=0;// 
a=0;//     mul-double/2addr v3, v10
a=0;// 
a=0;//     int-to-double v5, p2
a=0;// 
a=0;//     div-double v5, v3, v5
a=0;// 
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "extractThumbNail: extract beX = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", beY = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     cmpl-double v0, v7, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     move-wide v3, v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     double-to-int v0, v3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     iget v0, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     if-gt v0, v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget v0, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     iget v1, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     mul-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     const v1, 0x2a3000
a=0;// 
a=0;//     if-le v0, v1, :cond_7
a=0;// 
a=0;//     iget v0, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     const-string v1, "SDK_Sample.Util"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "decode bitmap failed: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Byte);v1=(One);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(DoubleLo);v6=(DoubleHi);v7=(DoubleLo);v8=(DoubleHi);
a=0;//     move-wide v3, v7
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     cmpg-double v0, v7, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_6
a=0;// 
a=0;//     move-wide v3, v5
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     move-wide v3, v7
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-eqz p3, :cond_9
a=0;// 
a=0;//     cmpl-double v0, v7, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     int-to-double v0, p2
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v10
a=0;// 
a=0;//     :try_start_1
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v9, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "bitmap required size="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "x"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", orig="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "x"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", sample="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p0, v9}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     const-string v1, "bitmap decode failed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Byte);v1=(Integer);v3=(DoubleLo);v4=(DoubleHi);v5=(DoubleLo);
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v10
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(DoubleLo);
a=0;//     cmpg-double v0, v7, v5
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_a
a=0;// 
a=0;//     int-to-double v0, p2
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v10
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Byte);v3=(DoubleLo);
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v10
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v4=(Reference,Ljava/lang/String;);v5=(Integer);
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "bitmap decoded size="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "x"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v0, v1, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     :goto_4
a=0;//     if-eqz p3, :cond_c
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v0, p2
a=0;// 
a=0;//     shr-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v3, p1
a=0;// 
a=0;//     shr-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v1, v0, v3, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     const-string v1, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "bitmap croped size="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v3=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v3=(Integer);v4=(One);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_d
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method protected static a([BIIZ)Landroid/graphics/Bitmap;
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const-wide/high16 v9, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     new-instance v7, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v0, v1, v7}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "extractThumbNail: round="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "x"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ", crop="
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     iget v0, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v9
a=0;// 
a=0;//     int-to-double v3, p1
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     div-double v5, v0, v3
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     iget v0, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     mul-double/2addr v0, v9
a=0;// 
a=0;//     int-to-double v3, p2
a=0;// 
a=0;//     div-double v3, v0, v3
a=0;// 
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "extractThumbNail: extract beX = "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v8, ", beY = "
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     cmpl-double v0, v5, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     move-wide v0, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     iget v0, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     if-gt v0, v11, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget v0, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     iget v1, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     const v1, 0x2a3000
a=0;// 
a=0;//     if-le v0, v1, :cond_6
a=0;// 
a=0;//     iget v0, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     const-string v1, "SDK_Sample.Util"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "decode bitmap failed: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v3=(DoubleLo);v4=(DoubleHi);v5=(DoubleLo);v6=(DoubleHi);v8=(Reference,Ljava/lang/String;);
a=0;//     move-wide v0, v5
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);
a=0;//     cmpg-double v0, v5, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     move-wide v0, v3
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Byte);v1=(Reference,Ljava/lang/String;);
a=0;//     move-wide v0, v5
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-eqz p3, :cond_8
a=0;// 
a=0;//     cmpl-double v0, v5, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     int-to-double v0, p2
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v9
a=0;// 
a=0;//     :try_start_1
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "bitmap required size="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "x"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", orig="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "x"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", sample="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     array-length v4, p0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p0, v0, v4, v7}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     const-string v0, "SDK_Sample.Util"
a=0;// 
a=0;//     const-string v1, "bitmap decode failed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Byte);v1=(Integer);v3=(DoubleLo);v4=(DoubleHi);v5=(DoubleLo);
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v9
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(DoubleLo);
a=0;//     cmpg-double v0, v5, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_9
a=0;// 
a=0;//     int-to-double v0, p2
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v9
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Byte);v3=(DoubleLo);
a=0;//     int-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     mul-double/2addr v0, v9
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v0, v3
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v4=(Integer);v5=(Integer);
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "bitmap decoded size="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "x"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v0, v1, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     :goto_4
a=0;//     if-eqz p3, :cond_b
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v0, p2
a=0;// 
a=0;//     shr-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v3, p1
a=0;// 
a=0;//     shr-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v1, v0, v3, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     const-string v1, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "bitmap croped size="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v3=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v3=(Integer);v4=(One);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_c
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method protected static a([B)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     aget-byte v3, v2, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     or-int/lit16 v3, v3, 0x100
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Reference,[B);v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Reference,Ljava/util/List;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;)[B
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-ge v2, v1, :cond_0
a=0;// 
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/graphics/Bitmap;Z)[B
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
