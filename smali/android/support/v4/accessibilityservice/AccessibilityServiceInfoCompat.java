package android.support.v4.accessibilityservice; class AccessibilityServiceInfoCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityServiceInfoCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;,
a=0;//         Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;,
a=0;//         Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FEEDBACK_ALL_MASK:I = -0x1
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     #p0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static feedbackTypeToString(I)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "feedbackType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 189
a=0;//     #v3=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 190
a=0;//     .local v0, "builder":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "["
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 191
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     if-lez p0, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shl-int v1, v3, v2
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "feedbackTypeFlag":I
a=0;//     #v1=(Integer);
a=0;//     xor-int/lit8 v2, v1, -0x1
a=0;// 
a=0;//     and-int/2addr p0, v2
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-le v2, v3, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     const-string v2, ", "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 197
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     :sswitch_0
a=0;//     const-string v2, "FEEDBACK_SPOKEN"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :sswitch_1
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "FEEDBACK_AUDIBLE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :sswitch_2
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "FEEDBACK_HAPTIC"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     :sswitch_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "FEEDBACK_GENERIC"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :sswitch_4
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "FEEDBACK_VISUAL"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 215
a=0;//     .end local v1    # "feedbackTypeFlag":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v2, "]"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 216
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 197
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x2 -> :sswitch_2
a=0;//         0x4 -> :sswitch_1
a=0;//         0x8 -> :sswitch_4
a=0;//         0x10 -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public static flagToString(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     .line 232
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 230
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     const-string v0, "DEFAULT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 228
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getDescription(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getDescription(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getId(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getId(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getResolveInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getResolveInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getSettingsActivityName(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     sget-object v0, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;->IMPL:Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl;->getSettingsActivityName(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
