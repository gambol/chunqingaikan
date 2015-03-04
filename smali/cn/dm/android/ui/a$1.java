package cn.dm.android.ui; class a$1 { void a() { int a;
a=0;// .class Lcn/dm/android/ui/a$1;
a=0;// .super Landroid/support/v4/view/PagerAdapter;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcn/dm/android/ui/a;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/dm/android/ui/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/ui/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iput-object p1, p0, Lcn/dm/android/ui/a$1;->a:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/ui/a$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a$1;->a:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     invoke-static {v0}, Lcn/dm/android/ui/a;->a(Lcn/dm/android/ui/a;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "container"    # Landroid/view/View;
a=0;//     .param p2, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     check-cast p1, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .end local p1    # "container":Landroid/view/View;
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a$1;->a:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     invoke-static {v0}, Lcn/dm/android/ui/a;->a(Lcn/dm/android/ui/a;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a$1;->a:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/ui/a;->a(Lcn/dm/android/ui/a;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;//     .param p2, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     if-ne p1, p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
