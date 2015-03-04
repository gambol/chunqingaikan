package com.twocloo.com.cn.fragment; class SearchResultFragment$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchResultFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/SearchResultFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// 
a=0;//     .line 138
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 5
a=0;//     .param p2, "arg1"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "arg3"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 142
a=0;//     .local v2, "intent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->access$3(Lcom/twocloo/com/cn/fragment/SearchResultFragment;)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/SearchResult;->getBookList()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     .line 144
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     const-string v3, "Articleid"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     const-string v3, "Sortname"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/NewBook;->getSortname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     const-string v3, "source"
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     const-string v3, "flag"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 148
a=0;//     const-string v3, "newbook"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 153
a=0;//     const/high16 v3, 0x4000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/SearchResultFragment$2;->this$0:Lcom/twocloo/com/cn/fragment/SearchResultFragment;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/SearchResultFragment;);
a=0;//     invoke-virtual {v3, v2}, Lcom/twocloo/com/cn/fragment/SearchResultFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
}}
