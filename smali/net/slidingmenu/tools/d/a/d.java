package net.slidingmenu.tools.d.a; class d { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/d/a/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;//     .locals 10
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v1, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     new-instance v3, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Rect;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     new-instance v4, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/RectF;);
a=0;//     int-to-float v5, p1
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v1, v6, v7, v8, v9}, Landroid/graphics/Canvas;->drawARGB(IIII)V
a=0;// 
a=0;//     const v6, -0xbdbdbe
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5, v5, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     new-instance v4, Landroid/graphics/PorterDuffXfermode;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/PorterDuffXfermode;);
a=0;//     sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/PorterDuff$Mode;);
a=0;//     invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/PorterDuffXfermode;);
a=0;//     invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
a=0;// 
a=0;//     invoke-virtual {v1, p0, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object p0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Landroid/graphics/drawable/BitmapDrawable;I)Landroid/graphics/drawable/BitmapDrawable;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {v1, p2}, Lnet/slidingmenu/tools/d/a/d;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/BitmapDrawable;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
