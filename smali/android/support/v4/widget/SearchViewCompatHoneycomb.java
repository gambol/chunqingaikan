package android.support.v4.widget; class SearchViewCompatHoneycomb { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SearchViewCompatHoneycomb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchViewCompatHoneycomb.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SearchViewCompatHoneycomb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static newOnQueryTextListener(Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "listener"    # Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Landroid/support/v4/widget/SearchViewCompatHoneycomb$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SearchViewCompatHoneycomb$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/SearchViewCompatHoneycomb$1;-><init>(Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompatHoneycomb$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newSearchView(Landroid/content/Context;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Landroid/widget/SearchView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/SearchView;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/SearchView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SearchView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static setOnQueryTextListener(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p0, "searchView"    # Ljava/lang/Object;
a=0;//     .param p1, "listener"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     check-cast p0, Landroid/widget/SearchView;
a=0;// 
a=0;//     .end local p0    # "searchView":Ljava/lang/Object;
a=0;//     check-cast p1, Landroid/widget/SearchView$OnQueryTextListener;
a=0;// 
a=0;//     .end local p1    # "listener":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
