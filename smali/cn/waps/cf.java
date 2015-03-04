package cn.waps; class cf { void a() { int a;
a=0;// .class Lcn/waps/cf;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Landroid/app/Dialog;
a=0;// 
a=0;// .field final synthetic d:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field final synthetic e:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field final synthetic f:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic g:Lcn/waps/bw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bw;Ljava/lang/String;Ljava/lang/String;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/cf;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/cf;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/cf;->c:Landroid/app/Dialog;
a=0;// 
a=0;//     iput-object p5, p0, Lcn/waps/cf;->d:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object p6, p0, Lcn/waps/cf;->e:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object p7, p0, Lcn/waps/cf;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/cf;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     iget v0, v0, Lcn/waps/bw;->c:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/bw;);
a=0;//     iget v1, v1, Lcn/waps/bw;->d:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x42480000    # 50.0f
a=0;// 
a=0;//     cmpg-float v1, v0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     cmpl-float v1, v0, v3
a=0;// 
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/high16 v1, -0x3db80000    # -50.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, v0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     cmpg-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Float);
a=0;//     const-string v0, "cpc"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cf;->c:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/bw;->a(Lcn/waps/bw;Ljava/lang/String;Landroid/app/Dialog;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Null);
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/bw;->l(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cf;->c:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/bw;->a(Lcn/waps/bw;Ljava/lang/String;Landroid/app/Dialog;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/bw;->l(Lcn/waps/bw;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cf;->d:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cf;->e:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0}, Lcn/waps/SDKUtils;->isWifi()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cf;->g:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     iget-object v1, p0, Lcn/waps/cf;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/cf;->c:Landroid/app/Dialog;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-static {v0, v1, v2}, Lcn/waps/bw;->a(Lcn/waps/bw;Ljava/lang/String;Landroid/app/Dialog;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     iget-object v0, p0, Lcn/waps/cf;->d:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cf;->e:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
