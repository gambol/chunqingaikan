package net.slidingmenu.tools.b.a.j.c; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/j/c/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/widget/Toast;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/j/c/b;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Landroid/widget/Toast;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Toast;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, p1, p2, v0, v1}, Lnet/slidingmenu/tools/b/a/j/c/b;->a(Ljava/lang/String;III)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x11
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lnet/slidingmenu/tools/b/a/j/c/b;->a(Ljava/lang/String;III)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;III)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     if-gtz p2, :cond_1
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, p4, v1, v2}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, p1, p3}, Lnet/slidingmenu/tools/b/a/j/c/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/c/b;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/16 v1, 0x30
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0, p2, v1}, Lnet/slidingmenu/tools/b/a/j/c/b;->a(Ljava/lang/String;III)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
