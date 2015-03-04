package net.slidingmenu.tools.b.b.k; class f { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/k/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:F
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Landroid/util/DisplayMetrics;Landroid/util/DisplayMetrics;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/16 v2, 0xa0
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/k/f;->a:I
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/k/f;->b:I
a=0;// 
a=0;//     iput-boolean v3, p0, Lnet/slidingmenu/tools/b/b/k/f;->c:Z
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->f:F
a=0;// 
a=0;//     iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->g:I
a=0;// 
a=0;//     iget v0, p1, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->h:I
a=0;// 
a=0;//     iget v0, p1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->f:F
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/k/f;->a:I
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "densityDpi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->a:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/k/f;->b:I
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "densityDpi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->b:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     iget v0, p2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->d:I
a=0;// 
a=0;//     iget v0, p2, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iget v1, p2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->e:I
a=0;// 
a=0;//     iput-boolean v3, p0, Lnet/slidingmenu/tools/b/b/k/f;->c:Z
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->d:I
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/k/f;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->d:I
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/k/f;->e:I
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/b/b/k/f;->d:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->e:I
a=0;// 
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->g:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->d:I
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->h:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->e:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->c:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->b(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     invoke-direct {v0, v2, v1}, Lnet/slidingmenu/tools/b/b/k/f;-><init>(Landroid/util/DisplayMetrics;Landroid/util/DisplayMetrics;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(F)F
a=0;//     .locals 3
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpg-float v1, p1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     move p1, v0
a=0;// 
a=0;//     :cond_0
a=0;//     #p1=(Integer);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Float);v2=(Byte);
a=0;//     return p1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Null);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/k/f;->f:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpg-float v2, v1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     move p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(I)I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     move p1, v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     return p1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);v2=(Uninit);
a=0;//     int-to-float v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/b/k/f;->f:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     move p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public c()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public d()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public e()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public f()F
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->f:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public g()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public h()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/k/f;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
