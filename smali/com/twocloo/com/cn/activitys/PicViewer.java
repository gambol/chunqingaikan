package com.twocloo.com.cn.activitys; class PicViewer { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/PicViewer;
a=0;// .super Lcn/sharesdk/framework/FakeActivity;
a=0;// .source "PicViewer.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private pic:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private picturePath:Ljava/lang/String;
a=0;// 
a=0;// .field private pictureUri:Landroid/net/Uri;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/FakeActivity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PicViewer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private compressImageFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 9
a=0;//     .param p1, "srcPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 72
a=0;//     #v8=(One);
a=0;//     new-instance v4, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     .local v4, "newOpts":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v4=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-boolean v8, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 74
a=0;//     invoke-static {p1, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 76
a=0;//     .local v1, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput-boolean v7, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 77
a=0;//     iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 78
a=0;//     .local v5, "w":I
a=0;//     #v5=(Integer);
a=0;//     iget v2, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 79
a=0;//     .local v2, "h":I
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, 0x44480000    # 800.0f
a=0;// 
a=0;//     .line 80
a=0;//     .local v3, "hh":F
a=0;//     #v3=(Integer);
a=0;//     const/high16 v6, 0x43f00000    # 480.0f
a=0;// 
a=0;//     .line 81
a=0;//     .local v6, "ww":F
a=0;//     #v6=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "be":I
a=0;//     #v0=(One);
a=0;//     if-le v5, v2, :cond_2
a=0;// 
a=0;//     int-to-float v7, v5
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v7, v7, v6
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     iget v7, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v7, v6
a=0;// 
a=0;//     float-to-int v0, v7
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 91
a=0;//     sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     iput-object v7, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 92
a=0;//     iput-boolean v8, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z
a=0;// 
a=0;//     .line 93
a=0;//     iput-boolean v8, v4, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z
a=0;// 
a=0;//     .line 95
a=0;//     invoke-static {p1, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 98
a=0;//     return-object v1
a=0;// 
a=0;//     .line 84
a=0;//     :cond_2
a=0;//     #v0=(One);v7=(Byte);
a=0;//     if-ge v5, v2, :cond_0
a=0;// 
a=0;//     int-to-float v7, v2
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v7, v7, v3
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     iget v7, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v7, v3
a=0;// 
a=0;//     float-to-int v0, v7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PicViewer;->finish()V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/high16 v1, -0x40000000    # -2.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pic:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pic:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pic:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->picturePath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->picturePath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/PicViewer;->compressImageFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pictureUri:Landroid/net/Uri;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pictureUri:Landroid/net/Uri;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pictureUri:Landroid/net/Uri;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/PicViewer;->compressImageFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "pic"    # Landroid/graphics/Bitmap;
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pic:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setImagePath(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->picturePath:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->pictureUri:Landroid/net/Uri;
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->ivViewer:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/PicViewer;->picturePath:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/activitys/PicViewer;->compressImageFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
