package cn.waps; class cw { void a() { int a;
a=0;// .class Lcn/waps/cw;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/waps/SDKUtils;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/SDKUtils;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/cw;->a:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/cw;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cw;->a:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-static {v0}, Lcn/waps/SDKUtils;->access$100(Lcn/waps/SDKUtils;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cw;->a:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/SDKUtils;->access$200(Lcn/waps/SDKUtils;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cw;->a:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/SDKUtils;->access$300(Lcn/waps/SDKUtils;)Lcn/waps/AppListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cw;->a:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/SDKUtils;->access$300(Lcn/waps/SDKUtils;)Lcn/waps/AppListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AppListener;->onBannerClose()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
