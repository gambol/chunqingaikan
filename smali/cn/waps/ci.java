package cn.waps; class ci { void a() { int a;
a=0;// .class Lcn/waps/ci;
a=0;// .super Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/app/Dialog;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/bw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/waps/bw;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ci;->b:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ci;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcn/waps/bw;Landroid/content/Context;Landroid/app/Dialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ci;->b:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ci;);
a=0;//     iput-object p3, p0, Lcn/waps/ci;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v1, p0, Lcn/waps/ci;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ci;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ci;->a:Landroid/app/Dialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "System.err"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
