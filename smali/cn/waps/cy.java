package cn.waps; class cy { void a() { int a;
a=0;// .class Lcn/waps/cy;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/SDKUtils;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/SDKUtils;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/cy;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/cy;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/cy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cy;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0}, Lcn/waps/SDKUtils;->initAdWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v0, 0x40cccccd    # 6.4f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v0, v2, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcn/waps/cy;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cy;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcn/waps/cy;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-static {v2}, Lcn/waps/SDKUtils;->access$100(Lcn/waps/SDKUtils;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cy;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-static {v0}, Lcn/waps/SDKUtils;->access$100(Lcn/waps/SDKUtils;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cy;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/SDKUtils;->access$200(Lcn/waps/SDKUtils;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/cy;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-static {v1}, Lcn/waps/SDKUtils;->access$100(Lcn/waps/SDKUtils;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
