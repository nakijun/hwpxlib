package kr.dogfoot.hwpxlib.reader.common;

public enum ElementReaderSort {
    Empty(ElementReaderType.Basic),

    Switch(ElementReaderType.Basic),
    Case(ElementReaderType.Basic),
    Default(ElementReaderType.Basic),

    HasOnlyText(ElementReaderType.Basic),
    LeftRightTopBottom(ElementReaderType.Basic),
    WidthAndHeight(ElementReaderType.Basic),
    XAndY(ElementReaderType.Basic),
    XAndYFloat(ElementReaderType.Basic),
    StartAndEndFloat(ElementReaderType.Basic),

    ParameterList(ElementReaderType.Basic),
    IntegerParam(ElementReaderType.Basic),
    StringParam(ElementReaderType.Basic),
    BooleanParam(ElementReaderType.Basic),
    FloatParam(ElementReaderType.Basic),
    ListParam(ElementReaderType.Basic),

    // Version.xml
    Version(ElementReaderType.Basic),

    // META-INF/manifest.xml
    Manifest(ElementReaderType.Basic),
    FileEntry(ElementReaderType.Basic),
    EncryptionData(ElementReaderType.Basic),
    Algorithm(ElementReaderType.Basic),
    KeyDerivation(ElementReaderType.Basic),
    StartKeyGeneration(ElementReaderType.Basic),

    // META-INF/container.xml
    Container(ElementReaderType.Basic),
    RootFiles(ElementReaderType.Basic),
    RootFile(ElementReaderType.Basic),

    // Contents/content.hpf
    Package(ElementReaderType.Basic),
    Metadata(ElementReaderType.Basic),
    Meta(ElementReaderType.Basic),
    PackageManifest(ElementReaderType.Basic),
    ManifestItem(ElementReaderType.Basic),
    Spine(ElementReaderType.Basic),
    SpineItemRef(ElementReaderType.Basic),

    // Settings.xml
    Settings(ElementReaderType.Basic),
    CaretPosition(ElementReaderType.Basic),
    ConfigItemSet(ElementReaderType.Basic),
    ConfigItem(ElementReaderType.Basic),

    // Contents/header_forTestSwitch.xml
    Head(ElementReaderType.Header),
    BeginNum(ElementReaderType.Header),
    RefList(ElementReaderType.Header),
    Fontfaces(ElementReaderType.Header),
    Fontface(ElementReaderType.Header),
    Font(ElementReaderType.Header),
    SubstFont(ElementReaderType.Header),
    TypeInfo(ElementReaderType.Header),
    BorderFills(ElementReaderType.Header),
    BorderFill(ElementReaderType.Header),
    Slash(ElementReaderType.Header),
    Border(ElementReaderType.Header),
    FillBrush(ElementReaderType.Header),
    WinBrush(ElementReaderType.Header),
    Gradation(ElementReaderType.Header),
    Color(ElementReaderType.Header),
    ImageBrush(ElementReaderType.Header),
    Image(ElementReaderType.Header),
    CharProperties(ElementReaderType.Header),
    CharPr(ElementReaderType.Header),
    StringValuesByLanguageReader(ElementReaderType.Header),
    ShortValuesByLanguageReader(ElementReaderType.Header),
    Underline(ElementReaderType.Header),
    Strikeout(ElementReaderType.Header),
    Outline(ElementReaderType.Header),
    CharShadow(ElementReaderType.Header),
    TabProperties(ElementReaderType.Header),
    TabPr(ElementReaderType.Header),
    TabItem(ElementReaderType.Header),
    Numberings(ElementReaderType.Header),
    Numbering(ElementReaderType.Header),
    ParaHead(ElementReaderType.Header),
    Bullets(ElementReaderType.Header),
    Bullet(ElementReaderType.Header),
    ParaProperties(ElementReaderType.Header),
    ParaPr(ElementReaderType.Header),
    Align(ElementReaderType.Header),
    Heading(ElementReaderType.Header),
    BreakSetting(ElementReaderType.Header),
    ParaMargin(ElementReaderType.Header),
    ValueAndUnit(ElementReaderType.Header),
    LineSpacing(ElementReaderType.Header),
    ParaBorder(ElementReaderType.Header),
    AutoSpacing(ElementReaderType.Header),
    Styles(ElementReaderType.Header),
    Style(ElementReaderType.Header),
    MemoProperties(ElementReaderType.Header),
    MemoPr(ElementReaderType.Header),
    TrackChanges(ElementReaderType.Header),
    TrackChange(ElementReaderType.Header),
    TrackChangeAuthors(ElementReaderType.Header),
    TrackChangeAuthor(ElementReaderType.Header),
    ForbiddenWordList(ElementReaderType.Header),
    CompatibleDocument(ElementReaderType.Header),
    LayoutCompatibility(ElementReaderType.Header),
    LayoutCompatibilityItem(ElementReaderType.Header),
    DocOption(ElementReaderType.Header),
    LinkInfo(ElementReaderType.Header),
    TrackChangeConfig(ElementReaderType.Header),

    // Contents/section0.xml
    Sec(ElementReaderType.Section_MasterPage),
    SubList(ElementReaderType.Section_MasterPage),
    Para(ElementReaderType.Section_MasterPage),
    Run(ElementReaderType.Section_MasterPage),
    SecPr(ElementReaderType.Section_MasterPage),
    Grid(ElementReaderType.Section_MasterPage),
    StartNum(ElementReaderType.Section_MasterPage),
    Visibility(ElementReaderType.Section_MasterPage),
    LineNumberShape(ElementReaderType.Section_MasterPage),
    PagePr(ElementReaderType.Section_MasterPage),
    PageMargin(ElementReaderType.Section_MasterPage),
    FootNotePr(ElementReaderType.Section_MasterPage),
    AutoNumFormat(ElementReaderType.Section_MasterPage),
    NoteLine(ElementReaderType.Section_MasterPage),
    NoteSpacing(ElementReaderType.Section_MasterPage),
    FootNoteNumbering(ElementReaderType.Section_MasterPage),
    FootNotePlacement(ElementReaderType.Section_MasterPage),
    EndNotePr(ElementReaderType.Section_MasterPage),
    EndNoteNumbering(ElementReaderType.Section_MasterPage),
    EndNotePlacement(ElementReaderType.Section_MasterPage),
    PageBorderFill(ElementReaderType.Section_MasterPage),
    Presentation(ElementReaderType.Section_MasterPage),
    Ctrl(ElementReaderType.Section_MasterPage),
    ColPr(ElementReaderType.Section_MasterPage),
    ColSz(ElementReaderType.Section_MasterPage),
    ColLine(ElementReaderType.Section_MasterPage),
    FieldBegin(ElementReaderType.Section_MasterPage),
    FieldEnd(ElementReaderType.Section_MasterPage),
    Bookmark(ElementReaderType.Section_MasterPage),
    HeaderFooter(ElementReaderType.Section_MasterPage),
    FootNoteEndNote(ElementReaderType.Section_MasterPage),
    AutoNumNewNum(ElementReaderType.Section_MasterPage),
    PageNumCtrl(ElementReaderType.Section_MasterPage),
    PageHiding(ElementReaderType.Section_MasterPage),
    PageNum(ElementReaderType.Section_MasterPage),
    Indexmark(ElementReaderType.Section_MasterPage),
    HiddenComment(ElementReaderType.Section_MasterPage),
    T(ElementReaderType.Section_MasterPage),
    MarkpenBegin(ElementReaderType.Section_MasterPage),
    TitleMark(ElementReaderType.Section_MasterPage),
    Tab(ElementReaderType.Section_MasterPage),
    TrackChangeTag(ElementReaderType.Section_MasterPage),
    LineSegArray(ElementReaderType.Section_MasterPage),
    LineSeg(ElementReaderType.Section_MasterPage),
    MasterPage(ElementReaderType.Section_MasterPage),

    ShapeSize(ElementReaderType.Controls),
    ShapePosition(ElementReaderType.Controls),
    Caption(ElementReaderType.Controls),
    Tbl(ElementReaderType.Controls),
    CellZoneList(ElementReaderType.Controls),
    CellZone(ElementReaderType.Controls),
    Tr(ElementReaderType.Controls),
    Tc(ElementReaderType.Controls),
    CellAddr(ElementReaderType.Controls),
    CellSpan(ElementReaderType.Controls),
    CellSize(ElementReaderType.Controls),
    Equation(ElementReaderType.Controls),
    Chart(ElementReaderType.Controls),
    Offset(ElementReaderType.Controls),
    Flip(ElementReaderType.Controls),
    RotationInfo(ElementReaderType.Controls),
    RenderingInfo(ElementReaderType.Controls),
    Matrix(ElementReaderType.Controls),
    Pic(ElementReaderType.Controls),
    LineShape(ElementReaderType.Controls),
    ImageRect(ElementReaderType.Controls),
    ImageDim(ElementReaderType.Controls),
    Effects(ElementReaderType.Controls),
    EffectsShadow(ElementReaderType.Controls),
    EffectsColor(ElementReaderType.Controls),
    ColorRGB(ElementReaderType.Controls),
    ColorCMYK(ElementReaderType.Controls),
    ColorSchema(ElementReaderType.Controls),
    ColorSystem(ElementReaderType.Controls),
    ColorEffect(ElementReaderType.Controls),
    EffectsGlow(ElementReaderType.Controls),
    EffectsSoftEdge(ElementReaderType.Controls),
    EffectsReflection(ElementReaderType.Controls),
    ContainerControl(ElementReaderType.Controls),
    OLE(ElementReaderType.Controls),

    DrawText(ElementReaderType.Controls),
    DrawingShadow(ElementReaderType.Controls),

    Line(ElementReaderType.Controls),
    Rect(ElementReaderType.Controls),
    Ellipse(ElementReaderType.Controls),
    Arc(ElementReaderType.Controls),
    Polygon(ElementReaderType.Controls),
    Curve(ElementReaderType.Controls),
    CurveSegment(ElementReaderType.Controls),
    ConnectLine(ElementReaderType.Controls),
    ConnectLinePoint(ElementReaderType.Controls),
    TextArt(ElementReaderType.Controls),
    TextArtPr(ElementReaderType.Controls),
    Compose(ElementReaderType.Controls),
    Dutmal(ElementReaderType.Controls),
    Btn(ElementReaderType.Controls),
    RadioBtn(ElementReaderType.Controls),
    CheckBtn(ElementReaderType.Controls),
    ComboBox(ElementReaderType.Controls),
    Edit(ElementReaderType.Controls),
    ListBox(ElementReaderType.Controls),
    ScrollBar(ElementReaderType.Controls),
    Video(ElementReaderType.Controls),

    End_Of_Entry(null);

    private ElementReaderType type;

    ElementReaderSort(ElementReaderType type) {
        this.type = type;
    }

    public ElementReaderType type() {
        return type;
    }
}
