package android.support.v4.widget; class SearchViewCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SearchViewCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchViewCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;,
a=0;//         Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;,
a=0;//         Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;,
a=0;//         Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SearchViewCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newSearchView(Landroid/content/Context;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->newSearchView(Landroid/content/Context;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static setOnQueryTextListener(Landroid/view/View;Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;)V
a=0;//     .locals 2
a=0;//     .param p0, "searchView"    # Landroid/view/View;
a=0;//     .param p1, "listener"    # Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;);
a=0;//     iget-object v1, p1, Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;->mListener:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, p0, v1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setOnQueryTextListener(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
}}
