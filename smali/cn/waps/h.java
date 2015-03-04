package cn.waps; class h { void a() { int a;
a=0;// .class Lcn/waps/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/webkit/WebView;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/e;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/e;Landroid/webkit/WebView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/h;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/e;);
a=0;//     iget-object v0, v0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     new-instance v1, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v2, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/e;);
a=0;//     iget-object v2, v2, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/waps/a;->a(Lcn/waps/a;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v1}, Lcn/waps/SDKUtils;->initAdWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcn/waps/a;->a(Lcn/waps/a;I)I
a=0;// 
a=0;//     const-string v0, "error"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/h;->a:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/e;);
a=0;//     iget-object v0, v0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a;->f(Lcn/waps/a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/e;);
a=0;//     iget-object v0, v0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a;->g(Lcn/waps/a;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v2, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/waps/a;->i(Lcn/waps/a;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Reference,Landroid/content/Context;);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/e;);
a=0;//     iget-object v0, v0, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a;->g(Lcn/waps/a;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v2, p0, Lcn/waps/h;->b:Lcn/waps/e;
a=0;// 
a=0;//     iget-object v2, v2, Lcn/waps/e;->a:Lcn/waps/a;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/waps/a;->i(Lcn/waps/a;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
