package net.slidingmenu.tools.b.a.i.a.a; class a { void a() { int a;
a=0;// .class public abstract Lnet/slidingmenu/tools/b/a/i/a/a/a;
a=0;// .super Landroid/app/Dialog;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lnet/slidingmenu/tools/b/a/e/a/b/f;
a=0;// .implements Lnet/slidingmenu/tools/b/a/e/d/b;
a=0;// .implements Lnet/slidingmenu/tools/b/a/i/a/b/a;
a=0;// .implements Lnet/slidingmenu/tools/b/a/j/a/a;
a=0;// .implements Lnet/slidingmenu/tools/b/a/j/b/l;
a=0;// .implements Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;// .field b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;// .field protected c:Landroid/content/Context;
a=0;// 
a=0;// .field protected d:Lnet/slidingmenu/tools/b/a/e/a/b/h;
a=0;// 
a=0;// .field private e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/g;Lnet/slidingmenu/tools/b/a/e/a/b/h;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/a/a;);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->g:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->h:I
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->w()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/g;Lnet/slidingmenu/tools/b/a/e/a/b/h;Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/g;Lnet/slidingmenu/tools/b/a/e/a/b/h;Z)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z
a=0;// 
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     iput-object p3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->d:Lnet/slidingmenu/tools/b/a/e/a/b/h;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->d:Lnet/slidingmenu/tools/b/a/e/a/b/h;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->d:Lnet/slidingmenu/tools/b/a/e/a/b/h;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->a(Lnet/slidingmenu/tools/b/a/i/a/b/a;)V
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, p2}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a(Lnet/slidingmenu/tools/b/a/e/g/g;)V
a=0;// 
a=0;//     if-nez p4, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->m()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->o()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->o()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "BASE64"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/util/EncodingUtils;->getBytes(Ljava/lang/String;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/b/a/i/a/b;->postUrl(Ljava/lang/String;[B)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Byte);v2=(PosByte);v3=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/g;->o()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/i/a/b;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lnet/slidingmenu/tools/b/a/e/g/g;)V
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     new-instance v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/b/a/i/a/a/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/b/a/i/a/a/b;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v3, p0}, Lnet/slidingmenu/tools/b/a/i/a/a/b;-><init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/i/a/a/a;)V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/i/a/a/b;);
a=0;//     iput-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/a/e/g/g;->h()Lnet/slidingmenu/tools/b/a/e/a/a/b;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/e/a/a/b;);
a=0;//     move-object v8, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v8=(Reference,Lnet/slidingmenu/tools/b/a/e/a/a/b;);
a=0;//     new-instance v10, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v10, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/g;->d()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/g;->d()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     and-int/lit8 v0, v0, 0x20
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/g;->j()Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;-><init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/j/a;Lnet/slidingmenu/tools/b/a/j/j;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/j/d;->setId(I)V
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/j/a/b;->a()Lnet/slidingmenu/tools/b/a/j/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lnet/slidingmenu/tools/b/a/j/a/b;->a(Ljava/lang/Object;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/a/j/d;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v10, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->d:Lnet/slidingmenu/tools/b/a/e/a/b/h;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/e/a/b/h;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/g;->d()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     #v4=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     invoke-virtual {v4}, Lnet/slidingmenu/tools/b/a/e/g/g;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     invoke-virtual {v4}, Lnet/slidingmenu/tools/b/a/e/g/g;->l()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p0
a=0;// 
a=0;//     move-object v9, p0
a=0;// 
a=0;//     #v9=(Reference,Lnet/slidingmenu/tools/b/a/i/a/a/a;);
a=0;//     invoke-direct/range {v0 .. v9}, Lnet/slidingmenu/tools/b/a/i/a/b;-><init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/a/b/h;ILnet/slidingmenu/tools/b/a/e/d/b;Ljava/lang/String;Ljava/lang/String;ILnet/slidingmenu/tools/b/a/e/a/a/b;Lnet/slidingmenu/tools/b/a/j/b/l;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/b/k/f;->a(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/a/e/g/g;->w()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const/high16 v1, 0x40c00000    # 6.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/b/k/f;->a(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     aput v0, v2, v3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v0, v3}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     new-instance v0, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "#cc999999"
a=0;// 
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const v2, 0x3f333333    # 0.7f
a=0;// 
a=0;//     iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/a/i/a/b;->getCurrentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v11, v11}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v1, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/e/g/g;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/b/a/e/g/g;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/a/e/g/g;->s()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/a/e/g/g;->t()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3, v0, v1}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a(IIII)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(One);v2=(Reference,Ujava/lang/Object;);v3=(Reference,Landroid/content/Context;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     move-object v8, v0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v8=(Reference,Lnet/slidingmenu/tools/b/a/e/a/a/b;);v10=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     move v0, v7
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Reference,Lnet/slidingmenu/tools/b/a/i/a/a/a;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v9=(Reference,Lnet/slidingmenu/tools/b/a/i/a/a/a;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private j()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->b()Lnet/slidingmenu/tools/b/a/i/a/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->b()Lnet/slidingmenu/tools/b/a/i/a/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/i;->b()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->reload()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->setTitleBackgroundColor(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(IIII)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v3, -0x270f
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Short);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     if-ne p1, v3, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     if-ne p2, v3, :cond_3
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iput p3, v2, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     iput p4, v2, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v3, v5}, Lnet/slidingmenu/tools/b/b/k/f;->a(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     iput v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     iget v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v3, v5}, Lnet/slidingmenu/tools/b/b/k/f;->a(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     iput v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     iget v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-le v4, v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     :cond_0
a=0;//     iget v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->c()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->c()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iput p3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->g:I
a=0;// 
a=0;//     iput p4, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->h:I
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Window;->setGravity(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/view/Window;);v2=(Reference,Landroid/view/WindowManager$LayoutParams;);v3=(Short);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput p1, v2, Landroid/view/WindowManager$LayoutParams;->x:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosByte);v1=(Reference,Landroid/view/Window;);v2=(Reference,Landroid/view/WindowManager$LayoutParams;);v3=(Short);v4=(Uninit);v5=(Uninit);
a=0;//     or-int/lit8 v0, v0, 0x30
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput p2, v2, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->reload()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->cancel()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/Runnable;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/m;->a()Lnet/slidingmenu/tools/b/b/k/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/m;);
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/b/k/m;->a(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;[B)Z
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Lnet/slidingmenu/tools/b/a/i/a/b;->postUrl(Ljava/lang/String;[B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->setPoints(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->setPointsUnit(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->clearHistory()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/a/i/a/b;->loadUrl(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method c()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/e/g/g;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/b/a/e/g/g;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->g:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->h:I
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/a/e/g/g;->s()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->i:Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/a/e/g/g;->t()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3, v0, v1}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a(IIII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->b:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->setPointsLayoutVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->canGoBack()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->c()Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->cancel()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public e()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public f()Lnet/slidingmenu/tools/b/a/e/a;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->clearHistory()V
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/e/a;->b:Lnet/slidingmenu/tools/b/a/e/a;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/e/a;->c:Lnet/slidingmenu/tools/b/a/e/a;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public g()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->j()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public h()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public i()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->j()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/a/a;->a:Lnet/slidingmenu/tools/b/a/i/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/i/a/a/a;->cancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
