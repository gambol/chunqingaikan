package com.tencent.connect.auth; class AuthAgent$FeedConfirmListener { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/auth/AuthAgent;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "FeedConfirmListener"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$ButtonListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field final synthetic b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 602
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;);
a=0;//     const-string v0, "sendinstall"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 603
a=0;//     const-string v0, "installwording"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 604
a=0;//     const-string v0, "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 607
a=0;//     iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 608
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 735
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 736
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 740
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 741
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 764
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/io/IOException;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 744
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/InputStream;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, ".9.png"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 745
a=0;//     invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 746
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 747
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 748
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-static {v3}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z
a=0;// 
a=0;//     .line 749
a=0;//     new-instance v0, Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/NinePatchDrawable;);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v0, v2, v3, v4, v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/NinePatchDrawable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 760
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 762
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Reference,Ljava/io/IOException;);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Reference,Landroid/graphics/Bitmap;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 752
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 755
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v2, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 756
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 760
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/view/View;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 769
a=0;//     new-instance v1, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 770
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     .line 771
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 772
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 774
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 777
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v2, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 778
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 779
a=0;//     sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 780
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setId(I)V
a=0;// 
a=0;//     .line 782
a=0;//     const/high16 v3, 0x42700000    # 60.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 783
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x42700000    # 60.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     .line 784
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x41600000    # 14.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     .line 785
a=0;//     #v5=(Integer);
a=0;//     const/high16 v5, 0x41900000    # 18.0f
a=0;// 
a=0;//     mul-float/2addr v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     .line 786
a=0;//     #v5=(Integer);
a=0;//     const/high16 v6, 0x40c00000    # 6.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     .line 787
a=0;//     #v6=(Integer);
a=0;//     const/high16 v7, 0x41900000    # 18.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     .line 788
a=0;//     #v7=(Integer);
a=0;//     new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v8, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 789
a=0;//     #v8=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v8, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     .line 790
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v8, v3, v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 792
a=0;//     invoke-virtual {v1, v2, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 795
a=0;//     new-instance v2, Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 796
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 797
a=0;//     const/high16 v3, 0x41600000    # 14.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 798
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 801
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V
a=0;// 
a=0;//     .line 802
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 803
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setLines(I)V
a=0;// 
a=0;//     .line 804
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     .line 805
a=0;//     const/high16 v3, 0x43390000    # 185.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMinWidth(I)V
a=0;// 
a=0;//     .line 806
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 807
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 808
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 809
a=0;//     const/high16 v4, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     .line 810
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/high16 v6, 0x40a00000    # 5.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v3, v4, v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 811
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 814
a=0;//     new-instance v2, Landroid/view/View;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/View;);
a=0;//     invoke-direct {v2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 815
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     const/16 v3, 0xd6
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/16 v4, 0xd6
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/16 v5, 0xd6
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {v3, v4, v5}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 816
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 817
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 818
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 819
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 820
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v3, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 821
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v3, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 822
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/high16 v7, 0x41400000    # 12.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v5, v6, v4, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 823
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 826
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 827
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 828
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 829
a=0;//     const/4 v4, 0x7
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 830
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 832
a=0;//     new-instance v4, Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/Button;);
a=0;//     invoke-direct {v4, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 833
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     const-string v5, "\u8df3\u8fc7"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 834
a=0;//     const-string v5, "buttonNegt.png"
a=0;// 
a=0;//     invoke-direct {p0, v5, p1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 835
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 836
a=0;//     const/16 v5, 0x24
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v6, 0x61
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v7, 0x83
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     invoke-static {v5, v6, v7}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 837
a=0;//     const/high16 v5, 0x41a00000    # 20.0f
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextSize(F)V
a=0;// 
a=0;//     .line 838
a=0;//     invoke-virtual {v4, p5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 839
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setId(I)V
a=0;// 
a=0;//     .line 840
a=0;//     new-instance v5, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/high16 v7, 0x42340000    # 45.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 841
a=0;//     #v5=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v6, 0x41600000    # 14.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 842
a=0;//     const/high16 v6, 0x40800000    # 4.0f
a=0;// 
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 843
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 844
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 846
a=0;//     new-instance v4, Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/Button;);
a=0;//     invoke-direct {v4, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 847
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     const-string v5, "\u786e\u5b9a"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 848
a=0;//     const/high16 v5, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextSize(F)V
a=0;// 
a=0;//     .line 849
a=0;//     const/16 v5, 0xff
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/16 v6, 0xff
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/16 v7, 0xff
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     invoke-static {v5, v6, v7}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 850
a=0;//     const-string v5, "buttonPost.png"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v5, p1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 851
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 852
a=0;//     invoke-virtual {v4, p4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 853
a=0;//     new-instance v5, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/high16 v7, 0x42340000    # 45.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 854
a=0;//     #v5=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 855
a=0;//     const/high16 v6, 0x40800000    # 4.0f
a=0;// 
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 856
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 862
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 897
a=0;//     const v2, 0x438b8000    # 279.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 898
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, 0x43230000    # 163.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     .line 899
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v4, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 901
a=0;//     #v4=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     const/high16 v2, 0x41600000    # 14.0f
a=0;// 
a=0;//     mul-float/2addr v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v5, 0x41400000    # 12.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v6, 0x41400000    # 12.0f
a=0;// 
a=0;//     mul-float/2addr v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v5, v6}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 902
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 903
a=0;//     const/16 v2, 0xf7
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/16 v3, 0xfb
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/16 v4, 0xf7
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-static {v2, v3, v4}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 906
a=0;//     new-instance v2, Landroid/graphics/drawable/PaintDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/PaintDrawable;);
a=0;//     const/16 v3, 0xf7
a=0;// 
a=0;//     const/16 v4, 0xfb
a=0;// 
a=0;//     const/16 v5, 0xf7
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-static {v3, v4, v5}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, v3}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V
a=0;// 
a=0;//     .line 907
a=0;//     #v2=(Reference,Landroid/graphics/drawable/PaintDrawable;);
a=0;//     const/high16 v3, 0x40a00000    # 5.0f
a=0;// 
a=0;//     mul-float/2addr v0, v3
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {v2, v0}, Landroid/graphics/drawable/PaintDrawable;->setCornerRadius(F)V
a=0;// 
a=0;//     .line 908
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 909
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 660
a=0;//     #v7=(Null);
a=0;//     new-instance v6, Landroid/app/Dialog;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/app/Dialog;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v6, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 661
a=0;//     #v6=(Reference,Landroid/app/Dialog;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v6, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 663
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 667
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 675
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 676
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 679
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     new-instance v4, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;);
a=0;//     invoke-direct {v4, p0, v6, p2, p3}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Landroid/app/Dialog;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 694
a=0;//     #v4=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$1;);
a=0;//     new-instance v5, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$2;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$2;);
a=0;//     invoke-direct {v5, p0, v6, p2, p3}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$2;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Landroid/app/Dialog;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 710
a=0;//     #v5=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$2;);
a=0;//     new-instance v0, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     invoke-direct {v0}, Landroid/graphics/drawable/ColorDrawable;-><init>()V
a=0;// 
a=0;//     .line 711
a=0;//     #v0=(Reference,Landroid/graphics/drawable/ColorDrawable;);
a=0;//     invoke-virtual {v0, v7}, Landroid/graphics/drawable/ColorDrawable;->setAlpha(I)V
a=0;// 
a=0;//     .line 712
a=0;//     invoke-virtual {v6}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 713
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 714
a=0;//     invoke-virtual {v6, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 715
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;);
a=0;//     invoke-direct {v0, p0, p2, p3}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;-><init>(Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 726
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener$3;);
a=0;//     invoke-virtual {v6, v0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
a=0;// 
a=0;//     .line 727
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 728
a=0;//     invoke-virtual {v6}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     .line 731
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 668
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Null);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 670
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 914
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->j(Lcom/tencent/connect/auth/AuthAgent;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 915
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->k(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v1}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 916
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCancel()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 929
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 930
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 932
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 612
a=0;//     #v3=(One);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 613
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 615
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 617
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 619
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v3, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 620
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 627
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 628
a=0;//     const-string v2, "TAG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, " WORDING = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "xx"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 629
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 630
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 631
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct {p0, v0, v1, p1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 647
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 622
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(One);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Reference,Lorg/json/JSONException;);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move-object v2, v6
a=0;// 
a=0;//     .line 623
a=0;//     #v2=(Reference,Lorg/json/JSONException;);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->b:Lcom/tencent/connect/auth/AuthAgent;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     invoke-static {v4}, Lcom/tencent/connect/auth/AuthAgent;->i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "json error"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     .line 624
a=0;//     invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     move-object v6, v1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 636
a=0;//     :cond_2
a=0;//     #v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 637
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 643
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 644
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 922
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 923
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 925
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
