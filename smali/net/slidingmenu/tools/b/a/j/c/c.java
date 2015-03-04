package net.slidingmenu.tools.b.a.j.c; class c { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/j/c/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private static a(Landroid/content/Context;)Landroid/graphics/drawable/NinePatchDrawable;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/c/c;->a:Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/NinePatchDrawable;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/b;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/b;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lnet/slidingmenu/tools/b/b/k/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/j/c/c;->a:Landroid/graphics/drawable/NinePatchDrawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/c/c;->a:Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/RelativeLayout;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/high16 v5, -0x1000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v3, "#ffcc00"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lnet/slidingmenu/tools/b/b/k/f;->a(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v2, v3, v4, v4, v5}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/high16 v3, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Lnet/slidingmenu/tools/b/b/k/f;->a(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v0, 0x13
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const v3, 0x108009b
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v0, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     const/16 v0, 0x12
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Integer);v5=(Integer);
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Landroid/widget/TextView;->setWidth(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/j/c/c;->a(Landroid/content/Context;)Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/NinePatchDrawable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Integer);
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
}}
