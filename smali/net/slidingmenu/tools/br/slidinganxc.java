package net.slidingmenu.tools.br; class slidinganxc { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/br/slidinganxc;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static h:I
a=0;// 
a=0;// .field private static i:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Lnet/slidingmenu/tools/br/slidinganxcListener;
a=0;// 
a=0;// .field protected b:Lnet/slidingmenu/tools/br/slidingakxc;
a=0;// 
a=0;// .field protected c:I
a=0;// 
a=0;// .field protected d:I
a=0;// 
a=0;// .field private e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/br/slidinganxc;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/br/slidinganxc;->g:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/br/slidingakxc;->FIT_SCREEN:Lnet/slidingmenu/tools/br/slidingakxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/slidingakxc;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->b:Lnet/slidingmenu/tools/br/slidingakxc;
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/br/slidinganxc;->setVisibility(I)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/br/slidinganxc;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "Invalid Banner size for showing ads."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/br/slidingaxxc;->sliaesds(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/br/slidinganxc;->a()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/d/a/w;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u6b63\u5e38\u5e7f\u544a\u6a21\u5f0f!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/b/b/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lnet/slidingmenu/tools/br/slidingakxc;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/br/slidinganxc;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/br/slidinganxc;->g:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/br/slidinganxc;->b:Lnet/slidingmenu/tools/br/slidingakxc;
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/br/slidinganxc;->setVisibility(I)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/br/slidinganxc;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "Invalid Banner size for showing ads."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/br/slidingaxxc;->sliaesds(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/br/slidinganxc;->a()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/d/a/w;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u6b63\u5e38\u5e7f\u544a\u6a21\u5f0f!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/b/b/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/webkit/WebView;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/br/slidinganxc;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "<html>\n<body>\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/br/slidinganxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</body>\n"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</html>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "text/html"
a=0;// 
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/br/slidinganxc;->c:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/br/slidinganxc;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lnet/slidingmenu/tools/br/slidinganxc;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/br/slidinganxc;->setVisibility(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/d/a/w;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/b/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->b:Lnet/slidingmenu/tools/br/slidingakxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/slidingakxc;);
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/br/slidingakxc;->slicfsd(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->c:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->b:Lnet/slidingmenu/tools/br/slidingakxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/slidingakxc;);
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/br/slidingakxc;->slicesd(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->d:I
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->d:I
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->c:I
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getVisibility()I
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/RelativeLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/e;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/br/e;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/br/slidinganxc;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p0}, Lnet/slidingmenu/tools/br/e;-><init>(Landroid/content/Context;Lnet/slidingmenu/tools/br/slidinganxc;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/e;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/br/e;->a()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/d/a/w;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/b/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/br/e;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/d/a/w;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/b/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onWindowFocusChanged(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowFocusChanged(Z)V
a=0;// 
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Lnet/slidingmenu/tools/br/e;->e:I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lnet/slidingmenu/tools/br/e;->e:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/d/a/w;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/b/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/br/slidinganxc;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/br/slidinganxc;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/br/slidinganxc;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/br/e;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/br/slidinganxc;->e:Lnet/slidingmenu/tools/br/e;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/br/e;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public slichsd(Lnet/slidingmenu/tools/br/slidinganxcListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/br/slidinganxc;->a:Lnet/slidingmenu/tools/br/slidinganxcListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
