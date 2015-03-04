package cn.sharesdk.framework.authorize; class d { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/authorize/d;
a=0;// .super Landroid/webkit/WebChromeClient;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/widget/TextView;
a=0;// 
a=0;// .field final synthetic b:I
a=0;// 
a=0;// .field final synthetic c:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/framework/authorize/RegisterView;Landroid/widget/TextView;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/d;->c:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/framework/authorize/d;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     iput p3, p0, Lcn/sharesdk/framework/authorize/d;->b:I
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onProgressChanged(Landroid/webkit/WebView;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/d;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     iget v1, p0, Lcn/sharesdk/framework/authorize/d;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/2addr v1, p2
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x64
a=0;// 
a=0;//     iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/d;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/d;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/d;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
